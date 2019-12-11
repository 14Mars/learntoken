package testapp1.learnthread.learnthread2_5;

import testapp1.learnthread.learnthread2_1.PrivateNum;

public class ThreadB extends Thread{

    private MyObject myObject;

    public ThreadB(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.setValue("nameA", "pwA");
    }
}