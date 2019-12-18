package testapp1.learnconcurrent.learnjoin;


public class TestRun implements Runnable{
    @Override
    public void run() {

        try {
            System.out.println("begin");
            Thread.sleep(5000L);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
