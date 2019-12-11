package testapp1.learnthread.learnthread3_1;


import java.util.List;

public class ThreadA extends Thread {
    List<String> stringList;

    public ThreadA(List<String> list) {
        this.stringList = list;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 20; i++) {

                stringList.add(String.valueOf(i));
                System.out.println("add " + i);
                Thread.sleep(1000L);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
