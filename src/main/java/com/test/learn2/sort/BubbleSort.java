package com.test.learn2.sort;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {1, 0, 9, 10, 8, 4, 5, 7, 6};

        bubbleSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(",");
        }
    }

    public static void bubbleSort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - i; j++) {
                if (isLarger(input[j], input[j + 1])) {
                    swap(input, j, j + 1);
                }
            }
        }
    }

    public static boolean isLarger(int one, int another) {
        return one > another;
    }

    public static void swap(int[] input, int oneIndex, int anotherIndex) {
        int tmp = input[oneIndex];
        input[oneIndex] = input[anotherIndex];
        input[anotherIndex] = tmp;
    }

}
