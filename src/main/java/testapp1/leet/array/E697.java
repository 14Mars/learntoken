package testapp1.leet.array;


import java.util.HashMap;
import java.util.Map;

public class E697 {
    public static void main(String[] args) {
        E697 e697 = new E697();
        int[] input = {1, 2, 2, 3, 1, 4, 2};
        int result = e697.findShortestSubArray(input);

        System.out.println(result);
    }

//    public int findShortestSubArray(int[] nums) {
//        //map key，数值
//        //map value，数值的次数，第一次出现的下标，最后一次出现的下标
//        Map<Integer, int[]> integerMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int[] valueArray = integerMap.getOrDefault(nums[i], new int[3]);
//            valueArray[0] = valueArray[0] + 1;
//
//
//
//        }
//
//
//    }


    public int findShortestSubArray(int[] nums) {
        //map key，数值
        //map value，数值的次数，
        Map<Integer, Integer> degreeMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        Map<Integer, Integer> lastIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            degreeMap.put(nums[i], degreeMap.getOrDefault(nums[i], 0) + 1);

            int firstIndex = firstIndexMap.getOrDefault(nums[i], -1);
            if (firstIndex == -1) {
                firstIndexMap.put(nums[i], i);
            }

            lastIndexMap.put(nums[i], i);
        }

        int maxDegree = -1;
        int shortestSubArray = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> degreeEntry : degreeMap.entrySet()) {
            if (degreeEntry.getValue() > maxDegree) {//当新的度大于max时，重新计算short
                maxDegree = degreeEntry.getValue();
                shortestSubArray = lastIndexMap.get(degreeEntry.getKey()) - firstIndexMap.get(degreeEntry.getKey()) + 1;
            } else if (degreeEntry.getValue() == maxDegree) {
                int subArrayLength = lastIndexMap.get(degreeEntry.getKey()) - firstIndexMap.get(degreeEntry.getKey()) + 1;
                if (shortestSubArray > subArrayLength) {
                    shortestSubArray = subArrayLength;
                }
            }
        }

        return shortestSubArray;
    }


}
