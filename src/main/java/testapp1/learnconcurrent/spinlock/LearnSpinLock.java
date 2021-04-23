package testapp1.learnconcurrent.spinlock;



import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LearnSpinLock {

    public static void main(String[] args) {
        SpinL spinL = new SpinL();

        Thread thread1 = new Thread(new TestRun("t1",spinL));
        Thread thread2 = new Thread(new TestRun("t2",spinL));
        Thread thread3 = new Thread(new TestRun("t3",spinL));

        thread1.start();
        thread2.start();
        thread3.start();


    }

    public static class TestRun implements Runnable {
        String name;
        SpinL lock;

        TestRun(String name, SpinL lock) {
            this.name = name;
            this.lock = lock;
        }

        @Override
        public void run() {
            for (;;){
                if (lock.lock()) {
                    System.out.println(name + " get lock");
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    lock.unlock();
                    System.out.println(name + " done");
                    break;
                } else {
                    try {
                        System.out.println(name + " sleep");
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    public static class SpinL {
        //1 for free
        //0 for lock
        AtomicInteger state = new AtomicInteger(1);

        public boolean lock() {
            return state.compareAndSet(1, 0);
        }


        public boolean unlock() {
            return state.compareAndSet(0, 1);
        }

    }

}
