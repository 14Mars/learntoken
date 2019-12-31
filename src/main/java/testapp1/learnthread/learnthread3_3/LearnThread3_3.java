package testapp1.learnthread.learnthread3_3;


/**
 * threadlocal的get
 */
public class LearnThread3_3 {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args) {
        if  (t1.get() == null){
            System.out.println("absent");
            t1.set("t1");
        }

        System.out.println(t1.get());
        System.out.println(t1.get());
    }

}
