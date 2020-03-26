package testapp1.leet.fenzhi;

/**
 * 实现 pow(x, n) ，即计算 x 的 n 次幂函数。
 */
public class PowXn {


    public static void main(String[] args) {
        double d = myPow(2.0, 4);

        System.out.println(d);
    }


    public static double myPow(double x, int n) {
//        long m = n;

        //幂小于0，取负数次幂，再求倒数
        if (n < 0) {
            return 1.0 / myPow(x, n);
        }

        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        double half = myPow(x, n / 2);

        return half * half * myPow(x, n % 2);

//        return myPow(x, n/2) * myPow(x, n/2) * myPow(x, n%2);

    }

    public static double myPow2(double x, int n) {

        double res = 1.0;
        for (int i = n; i != 0; i /= 2) {
            if (i % 2 != 0) {
                res *= x;
            }
            x *= x;
        }
        return n < 0 ? 1 / res : res;
    }

}
