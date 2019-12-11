package testapp1.learnthread.learnthread1_7;


public class LearnThread1_7 {

    public static void main(String[] args) {
        try {
            MyThread1_7 myThread1_7 = new MyThread1_7();
            myThread1_7.start();

            Thread.sleep(100L);

            myThread1_7.interrupt();
        } catch (InterruptedException e) {
            System.out.println("catch main");
            e.printStackTrace();
        }
    }


}
