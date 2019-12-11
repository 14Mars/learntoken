package testapp1.learnthread.learnthread2_5;


public class MyObject {
    private String username = "nameB";
    private String password = "passwordB";

    public synchronized void setValue(String name, String password) {
        try {
            this.username = name;
            Thread.sleep(2000);
            this.password = password;

            System.out.println("setValue method, thread name " + Thread.currentThread().getName()
                    + " username " + username + " password " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void getValue() {
        synchronized (username) {


            System.out.println("getValue method, thread name " + Thread.currentThread().getName()
                    + " username " + username + " password " + password);
        }
    }


}
