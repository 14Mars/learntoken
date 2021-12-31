package testapp1.leet.array;


import java.util.Arrays;

public class E628 {

    public static void main(String[] args) {
        E628 e628 = new E628();
        int[] input = {-1, -2, -3};
        int result = e628.maximumProduct2(input);
        System.out.println(result);
    }

    /**
     * 暴力解法，超时
     *
     * @param nums
     * @return
     */
    public int maximumProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int currentProduct = nums[i] * nums[j] * nums[k];
                    if (currentProduct > maxProduct) {
                        maxProduct = currentProduct;
                    }
                }
            }
        }
        return maxProduct;
    }


    /**
     * 排序
     *
     * @param nums
     * @return
     */
    public int maximumProduct1(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3],
                nums[nums.length - 1] * nums[0] * nums[1]);
    }


    /**
     * 线性扫描，找到5个值
     *
     * @param nums
     * @return
     */
    public int maximumProduct2(int[] nums) {
        int firstMax = -1001; //值范围为-1000到1000
        int secondMax = -1001;
        int thirdMax = -1001;
        int firstMin = 1001;
        int secondMin = 1001;

        //值可以相等
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = nums[i];
            } else if (nums[i] > secondMax) {//可以等于firstMax
                thirdMax = secondMax;
                secondMax = nums[i];
            } else if (nums[i] > thirdMax) {//可以等于secondMax
                thirdMax = nums[i];
            }

            //最大最小之间不能用else来区分
            if (nums[i] < firstMin) {
                secondMin = firstMin;
                firstMin = nums[i];
            } else if (nums[i] < secondMin) {
                secondMin = nums[i];
            }
        }

        return Math.max(firstMax * secondMax * thirdMax,
                firstMax * firstMin * secondMin);
    }

}
