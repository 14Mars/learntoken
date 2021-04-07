package testapp1.leet;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 *
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 *
 */
public class E27RemoveElement {

    public static void main(String[] args) {
        int[] input = {3, 2, 2, 3};
        int target = 3;

        int resultLength = removeElement(input, target);
        System.out.println(resultLength);
        System.out.println(input);
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int removedIndex = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != val) {
                nums[removedIndex] = nums[index];
                removedIndex++;
            }
        }
        return removedIndex;
    }

}
