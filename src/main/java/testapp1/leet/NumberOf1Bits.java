package testapp1.leet;

/**
 * 191 位1的个数
 * Created by bao on 2018/7/30.
 */
public class NumberOf1Bits {
    int hammingWeight(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                count++;
            }
            n = n / 2;
        }
        return count;
    }
}
