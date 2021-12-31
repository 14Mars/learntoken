package testapp1.leet.array;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/set-mismatch/
 */
public class E645 {

    public static void main(String[] args) {
        E645 e645 = new E645();
        int[] input = {1, 2, 2, 4};

        int[] result = e645.findErrorNums2(input);
        for (int i : result) {
            System.out.println(i);
        }
    }

    /**
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        int sumActual = 0;
        int sumDistinct = 0;
        Set<Integer> set = new HashSet<Integer>();

        for (int i : nums) {
            set.add(i);
            sumActual = sumActual + i;
        }

        for (int i : set) {
            sumDistinct = sumDistinct + i;
        }

        int duplicate = sumActual - sumDistinct;
        int missing = (1 + nums.length) * nums.length / 2 - sumDistinct;

        return new int[]{duplicate, missing};
    }


    public int[] findErrorNums2(int[] nums) {
        int duplicate = 0;
        int missing = 0;

        //key，数字，value，出现次数
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            //put key,  value = getkey+1
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //手工指定循环,值从1到n
        for (int i = 1; i <= nums.length; i++) {
            int count = map.getOrDefault(i, 0);
            if (count == 2) {
                duplicate = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }


    /**
     * 排序，根据排序后的特征
     *
     * @param nums
     * @return
     */
    public int[] findErrorNums3(int[] nums) {
        int duplicate = 0;
        int missing = 0;

        Arrays.sort(nums);
        if (nums[0] != 1) {
            missing = 1;
        }
        if (nums[nums.length - 1] != nums.length) {
            missing = nums.length;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] == nums[i]) {
                duplicate = nums[i];
            } else if (nums[i + 1] == nums[i] + 2) {
                missing = nums[i] + 1;
            }
        }

        return new int[]{duplicate, missing};
    }


}
