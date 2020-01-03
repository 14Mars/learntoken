package testapp1.learnthread.learnthread2_3;


public class TestVolatile implements Runnable {

    private String suspended = "false";
//    private volatile String suspended = "false";

    public String getSuspended() {
        return suspended;
    }

    public void setSuspended(String suspended) {
        this.suspended = suspended;
    }

    @Override
    public void run() {
        try {
            while (suspended.equals("false")) {
                System.out.println("run");
            }
            System.out.println("stoped");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
