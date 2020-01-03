package testapp1.learnthread.learnthread2_3;

/**
 * 测试volatile
 */
public class Thread2_3 {

    public static void main(String[] args) throws InterruptedException {
        TestVolatile testVolatile = new TestVolatile();
        Thread thread = new Thread(testVolatile);
        thread.start();

        Thread.sleep(1000);
        testVolatile.setSuspended("true");


        Thread.sleep(50000);




    }
}
