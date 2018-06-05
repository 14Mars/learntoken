package testapp1.leet;

import java.util.Arrays;

/**
 * Created by bao on 2018/6/5.
 */
public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            if (nums.length <= 1) {
                return false;
            }

            boolean contains = false;
            for (int source = 0; source < nums.length; source++) {
                for (int compare = source + 1; compare < nums.length; compare++) {
                    if (nums[source] == nums[compare]) {
                        contains = true;
                        break;
                    }
                }
            }

            return contains;

        }


    public boolean containsDuplicate2(int[] nums) {
        if (nums.length == 0) {
            return false;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        for (int i = 1; i < nums.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] > nums[j] && j+1 != i) {

                    break;
                }
                if(nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
