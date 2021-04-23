package testapp1.learnconcurrent.learncyclicbarrier;


import java.util.Random;
import java.util.concurrent.*;

public class LearnCyclicBarrier {

    public static void main(String[] args) {


        CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("total finish action");
            }
        });

        ExecutorService executor = Executors.newCachedThreadPool();

        executor.submit(new TestRun(1, cb));
        executor.submit(new TestRun(2, cb));
        executor.submit(new TestRun(3, cb));


    }


    public static class TestRun implements Runnable {

        private int data;

        private CyclicBarrier cb;

        private Random random = new Random();

        public TestRun(int data, CyclicBarrier cb) {
            this.data = data;
            this.cb = cb;
        }

        @Override
        public void run() {
            System.out.println("before cb" + data);
            try {
                int toSleep = random.nextInt(20);
                System.out.println(data + " sleep " + toSleep);
                TimeUnit.SECONDS.sleep(toSleep);
                cb.await();
                System.out.println("after cb" + data);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }


}
