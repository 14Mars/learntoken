package testapp1.model;


public class TestSwapReference {


    public static void main(String args[]) {
        String s1 = "s1";
        String s2 = "s2";
        swap(s1, s2);

        System.out.println("s1:" + s1);
        System.out.println("s2:" + s2);

    }

    public static void swap(String x, String y) {
        System.out.println("x before:" + x);
        System.out.println("y before:" + y);
        String tmp = x;
        x = y;
        y = tmp;
        System.out.println("x after:" + x);
        System.out.println("y after:" + y);
    }


}
