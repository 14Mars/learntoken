package testapp1.learnthread.learnthread2_1;


public class ThreadA extends Thread{

    private PrivateNum privateNum;

    public ThreadA(PrivateNum privateNum){
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        privateNum.add("a");
    }
}
