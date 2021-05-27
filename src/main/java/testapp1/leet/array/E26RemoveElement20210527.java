package testapp1.leet.array;

/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class E26RemoveElement20210527 {

    public static void main(String[] args) {
        int[] input = {2, 2, 2, 3};
        int target = 3;

        int resultLength = removeDuplicates(input);
        System.out.println(resultLength);
        System.out.println(input);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }

        int faster = 1;
        int slower = 0;

        //最后一个下标为length-1
        while (faster < nums.length) {
            if (nums[slower] == nums[faster]) {
                faster++;
            } else {
                slower++;
                nums[slower] = nums[faster];
                faster++;
            }
        }

        //长度为slower+1
        return slower + 1;
    }


}
