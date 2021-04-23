package testapp1.leet.array;


import java.util.HashMap;
import java.util.Map;

public class E1TwoSum {

    public static void main(String[] args) {
        int[] a = {2, 7, 11, 1};
        int target = 9;
    }

    //查不到返回null
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        //从num[0],到 num[length-2]，往后加
        for (int i = 0; i < nums.length - 1; i++) {
            //第二个数
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null;
    }


//    //使用map
//    public int[] twoSum2(int[] nums, int target) {
//        //key为数组的值，value为数组下标
//        Map<Integer, Integer> map = new HashMap();
//
//        for (int i = 0; i < nums.length; i++) {
//            int want = target - nums[i];
//            if (map.containsKey(want)) {
//                return new int[]{map.get(want), i};
//            }
//
//            map.put(nums[i], i);
//        }
//        return null;
//    }


    public int[] twoSum03(int nums[], int target) {
        //key为num[i],value为i
        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int want = target - nums[i];
            if (map.containsKey(want)) {
                //find
                return new int[]{map.get(want), i};
            }

            //未找到，录入map
            map.put(nums[i], i);
        }

        return null;
    }


}
