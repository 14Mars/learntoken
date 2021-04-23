package testapp1.learnconcurrent.learncountdown;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LearnCountDown {

    public static void main(String[] args) throws InterruptedException {

        CountDownLatch beginLatch = new CountDownLatch(1);


        for (int i = 0; i < 10; i++) {
            Thread candidate = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println("ready " + Thread.currentThread().getName());
                        beginLatch.await();
                        System.out.println("after wait " + Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            candidate.start();

        }


        System.out.println("main begin sleep");
        TimeUnit.SECONDS.sleep(5L);
        System.out.println("main recover ");
        beginLatch.countDown();


        Thread.currentThread().join();





    }


}
