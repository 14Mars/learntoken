package testapp1.learnthread.learnthread2_5;


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