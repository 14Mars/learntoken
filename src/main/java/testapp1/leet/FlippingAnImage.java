package testapp1.leet;

/**
 * 832. 翻转图像
 * Created by bao on 2018/7/30.
 */
public class FlippingAnImage {

    public int[][] flipAndInvertImage(int[][] A) {
        for (int[] outer : A) {
            int pre = 0;
            int last = outer.length - 1;
            int temp = 0;

            while (pre < last) {
                temp = outer[pre];
                outer[pre] = outer[last];
                outer[last] = temp;
                pre++;
                last--;
            }
            for (int i = 0; i < outer.length; i++) {
                outer[i] = 1 - outer[i];
            }
        }
        return A;
    }
}
