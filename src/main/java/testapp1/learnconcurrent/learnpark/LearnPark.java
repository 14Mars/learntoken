package testapp1.learnconcurrent.learnpark;


import testapp1.learnconcurrent.learnjoin.TestRun;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class LearnPark {

    public static void main(String[] args) throws InterruptedException {

        Integer lock = 1;

        Thread newThread = new Thread(new TestRun2(lock));
        newThread.start();


        TimeUnit.SECONDS.sleep(10);

        LockSupport.unpark(newThread);


    }


    public static class TestRun2 implements Runnable{
        Integer integer;

        public TestRun2(Integer integer) {
            this.integer = integer;
        }

        @Override
        public void run() {
            LockSupport.unpark(Thread.currentThread());
            LockSupport.unpark(Thread.currentThread());
            LockSupport.unpark(Thread.currentThread());
            Instant i1 = Instant.now();
            System.out.println("before park at "+i1.toEpochMilli());
            LockSupport.park(integer);
            LockSupport.park(integer);
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Instant i2 = Instant.now();
            System.out.println("after park at "+i2.toEpochMilli());
            System.out.println("i2 - i1 = "+ (i2.toEpochMilli()-i1.toEpochMilli()));
        }
    }


}
