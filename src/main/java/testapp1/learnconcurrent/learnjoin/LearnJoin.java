package testapp1.learnconcurrent.learnjoin;


import java.util.concurrent.ThreadFactory;

public class LearnJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread testRun = new Thread(new TestRun());
        testRun.start();

        testRun.join();

        System.out.println("main end");





    }
}
