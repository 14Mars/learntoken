package com.test.learn2.sort;


public class InsertionSort {

    public static void main(String[] args) {
        int[] input = {1, 0, 9, 10, 8, 4, 5, 7, 6};

        insertionSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            System.out.print(",");
        }
    }

    //是从右往左挨个比较，插入到
    public static void insertionSort(int[] input) {
//        for (int i = 1; i < input.length; i++) { //从第i个数开始看，i之前的数是已经排好序的，第i轮结束，从0到i是排好序的
//            for (int j=i; isLess(j,i)&& j>0;j--){
//
//            }
//        }
    }

}
