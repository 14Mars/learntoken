package testapp1.learnconcurrent.learnfuturetask;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class FutureTaskDemo {

//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        //创建一个futureTask对象
//        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println(Thread.currentThread().getName() + "\t" + "---come in");
//                TimeUnit.SECONDS.sleep(5);
//                return "done";
//            }
//        });
//
//        //
//        new Thread(futureTask, "t1").start();
//
//        System.out.println("---continue main thread");
//        String result = futureTask.get();
//        System.out.println("future task result:" + result);
//    }


//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        //创建一个futureTask对象
//        FutureTask<String> futureTask = new FutureTask<>(new Callable<String>() {
//            @Override
//            public String call() throws Exception {
//                System.out.println(Thread.currentThread().getName() + "\t" + "---come in");
//                TimeUnit.SECONDS.sleep(5);
//                return "done";
//            }
//        });
//
//        //
//        new Thread(futureTask, "t1").start();
//
//        System.out.println("---continue main thread");
////
////        while(true){
////
////        }
////
////        String result = futureTask.get();
////        System.out.println("future task result:" + result);
//    }

    volatile int i;
    int j;


    public static void main(String[] args) {
        FutureTaskDemo demo = new FutureTaskDemo();
        demo.i = 1;
        demo.j = 0;


    }


}
