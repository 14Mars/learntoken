package testapp1.learnthread.learnthread2_1;

public class ThreadB extends Thread{

    private PrivateNum privateNum;

    public ThreadB(PrivateNum privateNum){
        this.privateNum = privateNum;
    }

    @Override
    public void run() {
        privateNum.add("b");
    }
}