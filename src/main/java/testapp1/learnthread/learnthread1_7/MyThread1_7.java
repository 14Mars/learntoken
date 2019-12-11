package testapp1.learnthread.learnthread1_7;

public class MyThread1_7 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 50000; i++) {
            System.out.println("i=" + i);
        }
    }
}
