package testapp1.learnthread.learnthread2_1;


import testapp1.learnthread.learnthread3_1.ThreadB;

public class PrivateNum {

    private int value = 0;

//    public void add(String username) {
    public synchronized void add(String username) {
        try {
            if (username.equals("a")) {
                value = 100;
                System.out.println("add a done");
                Thread.sleep(2000);
            } else if (username.equals("b")) {
                value = 200;
                System.out.println("add b done");
                Thread.sleep(2000);
            }
            System.out.println("username:" + username + " value is " + value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
