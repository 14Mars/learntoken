package testapp1.leet.shulun;


/**
 * 素数，
 * 只能被1和自身整除的数
 * 1.从2开始找，删除被2整除的数
 * 2.找到下一个没有被删除的数字n
 * 3.删除能被n整除的数
 * 4.如果n*n>范围最大值，则跳出，否则到第2步骤
 */
public class PrimeDigits {

    public static void main(String[] args) {
        int[] result = new int[50000];
    }


    public static void chosePrime(int n, int[] result) {
        result[0] = 1;
        result[1] = 1;

        //下标为0的是质数
        for (int i = 2; i * i < n; i++) {
            //不是质数的，跳过
            if (result[i] == 0) {
                for (int j = 2 * i; j <= n; j += i) {
                    result[j] = 1;
                }

            }

        }


    }


}
