package testapp1.leet.bit;

import java.util.Random;

/**
 * 1-1000这个1000个数放在含有1001个元素的数组中，只有唯一的一个元素值重复，其它均只出现一次。每个数组元素只能访问一次，设计一个算法，将它找出来。
 */
public class PairNumber {

    public static void main(String[] args) {
        //数组size
        int N = 1001;

        //原始数据数组
        int[] array = new int[N];

        //初始化，赋值为1-1000
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = i + 1;
        }

        //random值为0到bound
        array[array.length - 1] = new Random().nextInt(N - 1) + 1;


        //看一下
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        System.out.println();

        //开始比较
        int x1 = 0;


        for (int i = 1; i <= array.length - 1; i++) {
            x1 = (x1 ^ i);
        }

        for (int i = 0; i < array.length; i++) {
            x1 = x1 ^ array[i];
        }


        System.out.println(x1);

    }


}
