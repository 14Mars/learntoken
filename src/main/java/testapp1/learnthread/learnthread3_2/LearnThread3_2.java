package testapp1.learnthread.learnthread3_2;

/**
 *
 */
public class LearnThread3_2 {

    /**
     * 测试不加锁wait 抛出IllegalMonitorStateException
     * @param args
     */
    public static void main(String[] args) {
        String s = "1";

        try {
            s.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
