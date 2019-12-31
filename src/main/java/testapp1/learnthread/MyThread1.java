package testapp1.learnthread;

/**
 * 查看current thread: isAlive
 */
public class MyThread1 extends Thread{

    @Override
    public void run() {
        System.out.println("run->"+this.isAlive());
    }
}
