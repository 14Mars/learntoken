package testapp1.learnthread.learnthread3_1;


import java.util.List;

public class ThreadB extends Thread {

    List<String> stringList;

    public ThreadB(List<String> stringList) {
        this.stringList = stringList;
    }

    @Override
    public void run() {
        try {
            while (true) {
//                System.out.println("B");
                if (stringList.size() == 5) {
                    System.out.println("线程B要退出了");

                    throw new InterruptedException();
                }
                Thread.sleep(100L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
