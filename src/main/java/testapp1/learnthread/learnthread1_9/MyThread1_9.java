package testapp1.learnthread.learnthread1_9;


import java.time.Instant;

public class MyThread1_9 extends Thread{

    @Override
    public void run() {
        Instant begin = Instant.now();

        for (int i = 0 ;i<50000;i++){
            Thread.yield();
        }

        Instant end = Instant.now();

        System.out.println(end.getNano()-begin.getNano());

    }
}
