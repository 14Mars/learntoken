package testapp1.leet.array;


public class E414 {

    public static void main(String[] args) {
        E414 e414 = new E414();
        int[] input = {1, 2, -2147483648};
        int result = e414.thirdMax(input);
        System.out.println(result);
    }

    /**
     * @param nums
     * @return
     */
    public int thirdMax(int[] nums) {

        long firstLarge = Long.MIN_VALUE;
        long secondLarge = Long.MIN_VALUE;
        long thirdLarge = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            //大于first, 从third起依次更新third,second,first
            if (nums[i] > firstLarge) {
                thirdLarge = secondLarge;
                secondLarge = firstLarge;
                firstLarge = nums[i];

                //大于second,小于first，排除掉相等的情况。从third起依次更新third,second
            } else if (nums[i] > secondLarge && nums[i] < firstLarge) {
                thirdLarge = secondLarge;
                secondLarge = nums[i];
            } else if (nums[i] > thirdLarge && nums[i] < secondLarge) {//大于third, 从third起依次更新third
                thirdLarge = nums[i];
            }
        }
//        Long.MIN_VALUE
        if (thirdLarge == Long.MIN_VALUE) {
            return (int)firstLarge;
        } else {
            return (int)thirdLarge;
        }
    }

}
