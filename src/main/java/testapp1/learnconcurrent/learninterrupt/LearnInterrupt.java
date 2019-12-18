package testapp1.learnconcurrent.learninterrupt;



public class LearnInterrupt {

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new TestGenerator());
//            TestGenerator testGenerator = new TestGenerator();

            thread.start();

            Thread.sleep(4000L);
//
//
            thread.interrupt();

        } catch (Exception e) {
            System.out.println("222");
            e.printStackTrace();
        }

    }
}
