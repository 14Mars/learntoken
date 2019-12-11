package testapp1.learnthread;


public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("run->"+this.isAlive());
    }
}
