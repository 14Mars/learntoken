package testapp1.leet;

/**
 * 如果数组是单调递增或单调递减的，那么它是单调的。
 *
 * 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
 *
 * 当给定的数组 A 是单调数组时返回 true，否则返回 false
 *
 */
public class E896IsMonotonic {

    public static void main(String[] args) {

    }

    public static boolean isMonotonic(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return true;
        }

        boolean isUpper = false; //后数大于前数
        boolean isLower = false; //后续小于前数

        //从第二个元素开始比较，即取a[index]和a[index-1]比较
        for (int index = 1; index < A.length; index++) {
            if (A[index] > A[index - 1]) {
                isUpper = true;

            } else if (A[index] < A[index - 1]) {
                isLower = true;
            }
        }

        return isUpper || isLower;
    }


    public static boolean isMonotonicV1(int[] A) {
        if (A.length == 0 || A.length == 1) {
            return true;
        }

        boolean isUpper = false; //后数大于前数
        boolean isLower = false; //后续小于前数

        //从第二个元素开始比较，即取a[index]和a[index-1]比较
        for (int index = 1; index < A.length; index++) {
            if (A[index] > A[index - 1]) {
                isUpper = true;

                if (isLower) {
                    return false;
                }

            } else if (A[index] < A[index - 1]) {
                isLower = true;

                if (isUpper) {
                    return false;
                }
            }
        }
        return true;
    }
}
