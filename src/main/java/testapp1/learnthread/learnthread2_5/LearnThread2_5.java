package testapp1.learnthread.learnthread2_5;


import testapp1.learnthread.learnthread2_1.PrivateNum;

public class LearnThread2_5 {

    public static void main(String[] args) {
        try {
        MyObject myObject = new MyObject();

        ThreadA threadA = new ThreadA(myObject);
//        ThreadB threadB = new ThreadB(myObject);

        threadA.start();

            Thread.sleep(200);
            myObject.getValue();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
