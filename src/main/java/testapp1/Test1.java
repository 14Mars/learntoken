package testapp1;

import java.io.Serializable;


public class Test1 implements Serializable {

    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        plusOne(a);
    }

    public static int[] plusOne(int[] digits) {

        int original = 0;

        for (int i = 0; i < digits.length; i++) {
            original = original * 10 + digits[i];
            System.out.println(i);
            System.out.println(original);
        }

        int plusOne = original + 1;

        return new int[]{plusOne};

    }



}
