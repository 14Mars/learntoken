package testapp1.leet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by bao on 2018/5/30.
 *   ɾ�����������е��ظ���
 */


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }


        int result = 0;
        int current = result + 1;
        //�����α꣬�������ֱ��������
        while (current < nums.length) {
            System.out.println("result:" + result + "," + nums[result] + "," + "current:" + current + "," + nums[current]);
            if (nums[result] != nums[current]) {
                result++;
                nums[result] = nums[current];
                current++;
            } else {
                current++;
            }


        }
        System.out.println("result:" + result);
        return result + 1;


    }

    public int removeDuplicates2(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }






}

public class RemoveDuplicate {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] nums = stringToIntegerArray(line);

            int ret = new Solution().removeDuplicates(nums);
            String out = integerArrayToString(nums, ret);

            System.out.print(out);
        }
    }
}

