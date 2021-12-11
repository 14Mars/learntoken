package com.test.learn2.sort;


public class SelectSort {
    public static void main(String[] args) {
        int[] input = {1, 0, 9, 10, 8, 4, 5, 7, 6};

        selectSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(",");
        }
    }

    public static void selectSort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {//确定每个下标的值。每个下的值为剩下的最小值
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {//找到后续的最小值
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }
            swap(input, i, minIndex);//有的地方还限制了i != minIndex
        }
    }

//    public static boolean isLarger(int one, int another) {
//        return one > another;
//    }

    public static void swap(int[] input, int oneIndex, int anotherIndex) {
        int tmp = input[oneIndex];
        input[oneIndex] = input[anotherIndex];
        input[anotherIndex] = tmp;
    }


}
