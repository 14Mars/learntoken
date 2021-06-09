package testapp1.leet.array;


public class Shuzujiaoji {

    public static void main(String[] args) {
//        int[] a = intersection(int[] nums1, int[] nums2)
    }

    public int[] intersection(int[] nums1, int[] nums2) {


        if (nums1 == null || nums2 == null
                || nums1.length == 0 || nums2.length == 0) {
            int[] empty = {};
            return empty;
        }
        int[] result = new int[nums1.length];
        int m = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[m] = nums1[i];
                    m++;
                }
            }
        }

        return result;

    }




    public int[] intersection02(int[] nums1, int[] nums2) {


        if (nums1 == null || nums2 == null
                || nums1.length == 0 || nums2.length == 0) {
            int[] empty = {};
            return empty;
        }
        int[] result = new int[nums1.length];
        int m = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    result[m] = nums1[i];
                    m++;
                }
            }
        }

        return result;

    }


}
