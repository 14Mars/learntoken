package testapp1.learnconcurrent.learninterrupt;


public class TestGenerator implements Runnable {


    @Override
    public void run() {
//        Thread.currentThread().setUncaughtExceptionHandler();
        long number = 1L;
        while (true) {
            try {
                System.out.println("process:" + number);
//            if (isInterrupted()) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("is interrupted.");
                    return;
                }

                Thread.sleep(5000L);

                if (number == 10000) {
                    Thread.currentThread().interrupt();
                }
                number++;
            }catch (InterruptedException e){
                System.out.println("catch interrupt exception");
                Thread.currentThread().interrupt();
                number++;
            }
        }
    }
}
