package testapp1.leet;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 */
public class E283MoveZeros {

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 2, 4, 5};
        moveZero2(a);

        System.out.println(a);
    }


    public static void moveZero(int[] array) {
        if (array.length == 0) {
            return;
        }

        int index = 0;
        int noZeroIndex = 0;

        while (index < array.length) {
            if (array[index] == 0) {
                index++;
            } else {
                array[noZeroIndex] = array[index];
                index++;
                noZeroIndex++;
            }
        }

        while (noZeroIndex < array.length) {
            array[noZeroIndex] = 0;
            noZeroIndex++;
        }

    }


    public static void moveZero2(int[] array) {
        int noZeroIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int tmp = array[noZeroIndex];
                array[noZeroIndex] = array[i];
                array[i] = tmp;

                noZeroIndex++;
            }
        }
    }


}
