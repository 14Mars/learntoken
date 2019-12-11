package testapp1.learnthread;


public class LearnThread1 {

    /**
     * current thread
     * @param args
     */
    public static void main1(String args[]){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }

    public static void main(String args[]){
        MyThread1 myThread1 = new MyThread1();

        System.out.println("mythread1 begin:"+ myThread1.isAlive());
        myThread1.start();
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("mythread1 end:"+ myThread1.isAlive());


    }






}
