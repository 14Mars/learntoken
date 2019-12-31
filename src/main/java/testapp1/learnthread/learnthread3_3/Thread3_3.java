package testapp1.learnthread.learnthread3_3;


import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Thread3_3 {

    public static void main(String[] args) {
        //新建一个ThreadLocal
        ThreadLocal<String> local1 = new ThreadLocal<>();
        ThreadLocal<String> local2 = new ThreadLocal<>();
        InheritableThreadLocal<String> inLocal3 = new InheritableThreadLocal<>();

        inLocal3.set("main");

        //新建一个随机数类
        Random random = new Random();
        //使用java8的Stream新建5个线程
        IntStream.range(0, 5).forEach(a -> new Thread(() -> {
            //为每一个线程设置相应的local值
            local1.set(a + "l1  " + random.nextInt(10));
            local2.set(a + "l2  " + random.nextInt(10));
            System.out.println("线程和local1值分别是  " + local1.get());
            System.out.println("线程和local2值分别是  " + local2.get());
            System.out.println("线程和inLocal3值分别是  " + inLocal3.get());
            inLocal3.set("change to "+random.nextInt(10));

            System.out.println("线程和inLocal3值修改后分别是  " + inLocal3.get());
            Thread.currentThread().getName();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());


        System.out.println(Thread.currentThread().getName()+inLocal3.get());
    }
}



