package testapp1.leet.array;

/**
 * https://leetcode-cn.com/problems/find-the-middle-index-in-array/
 * 1 <= nums.length <= 100
 * -1000 <= nums[i] <= 1000
 */
public class E1991 {

    public static void main(String[] args) {
        E1991 e1991 = new E1991();
        int[] input = {1,-1,4};
        int result = e1991.findMiddleIndex4(input);
        System.out.println(result);
    }

    public int findMiddleIndex(int[] nums) {

        if (nums == null) {
            return -1;
        }
        if (nums.length == 1) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        int sumLeft = 0;
        int sumRight = 0;

        while (left < right - 1) {
            if (sumLeft <= sumRight) {//left part is less
                sumLeft = sumLeft + nums[left];
                left++;
            } else {
                sumRight = sumRight + nums[right];
                right--;
            }
        }

        if (sumLeft == sumRight) {
            return left + 1;
        } else {
            return -1;
        }

    }


    /**
     * 暴力解法
     *
     * @param nums
     * @return
     */
    public int findMiddleIndex2(int[] nums) {
        //1个元素，下标为0.
        if (nums.length == 1) {
            return 0;
        }

        //对每个index，计算sum前和sum后
        for (int i = 0; i < nums.length; i++) {
            int preIndex = partSumBefore(nums, i);
            int postIndex = partSumAfter(nums, i);

            if (preIndex == postIndex) {
                return i;
            }
        }
        return -1;
    }

    //i之前的sum
    private int partSumBefore(int[] nums, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    //i之后的sum
    private int partSumAfter(int[] nums, int index) {
        int sum = 0;
        for (int i = index + 1; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }


    /**
     * @param nums
     * @return
     */
    public int findMiddleIndex3(int[] nums) {
        //1个元素，下标为0.
        if (nums.length == 1) {
            return 0;
        }

        //对每个index，计算sum前和sum后
        for (int i = 0; i < nums.length; i++) {
            int preIndex = partSum(nums, 0, i - 1);
            int postIndex = partSum(nums, i + 1, nums.length - 1);

            if (preIndex == postIndex) {
                return i;
            }
        }
        return -1;
    }


    private int partSum(int[] nums, int start, int end) {
        if (end < 0) {
            return 0;
        }
        if (start > nums.length - 1) {
            return 0;
        }

        if (start > end) {
            return 0;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }


    /**
     * 使用sum和减前缀和
     *
     * @param nums
     * @return
     */
    public int findMiddleIndex4(int[] nums) {
        int sumTotal = 0;
        int sumPre = 0;

        for (int i = 0; i < nums.length; i++) {
            sumTotal = sumTotal + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            //先比较是否符合条件，此时index i还没有被加入sum pre
            int sumPost = sumTotal - sumPre - nums[i];
            if (sumPre == sumPost) {
                return i;
            }
            //更新sum pre，等下一次计算
            sumPre = sumPre + nums[i];
        }

        return -1;
    }


}
