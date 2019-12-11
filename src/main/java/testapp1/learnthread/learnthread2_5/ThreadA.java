package testapp1.learnthread.learnthread2_5;



public class ThreadA extends Thread{

    private MyObject myObject;

    public ThreadA(MyObject myObject){
        this.myObject = myObject;
    }

    @Override
    public void run() {
        myObject.setValue("nameA", "pwA");
    }
}
