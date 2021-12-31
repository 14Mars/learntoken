package testapp1.leet.array;

/**
 * https://leetcode-cn.com/problems/max-consecutive-ones/
 */
public class E485 {
    public static void main(String[] args) {
        E485 e485 = new E485();
        int[] input = {1, 1, 0, 1, 1, 1};
        int result = e485.findMaxConsecutiveOnes(input);
        System.out.println(result);

    }

    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 0;//最大长度
        int currentLength = 0;//当前长度
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentLength++;
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            } else {
                currentLength = 0;
            }
        }
        return maxLength;
    }


    public int findMaxConsecutiveOnes2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxLength = 0;//最大长度
        int currentLength = 0;//当前长度
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            }
        }
        return Math.max(maxLength, currentLength);
    }

}
