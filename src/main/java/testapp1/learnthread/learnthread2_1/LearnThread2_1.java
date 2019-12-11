package testapp1.learnthread.learnthread2_1;


public class LearnThread2_1 {
    /**
     * 访问同一个对象，锁为该对象
     * @param args
     */
    public static void main1(String[] args) {
        PrivateNum privateNum = new PrivateNum();

        ThreadA threadA = new ThreadA(privateNum);
        ThreadB threadB = new ThreadB(privateNum);

        threadA.start();
        threadB.start();
    }


    /**
     * 访问不同对象，锁为各自对象
     * @param args
     */
    public static void main(String[] args) {
        PrivateNum privateNum1 = new PrivateNum();
        PrivateNum privateNum2 = new PrivateNum();

        ThreadA threadA = new ThreadA(privateNum1);
        ThreadB threadB = new ThreadB(privateNum2);

        threadA.start();
        threadB.start();
    }
}
