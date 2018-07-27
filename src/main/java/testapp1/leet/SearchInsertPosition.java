package testapp1.leet;

/**
 * Created by bao on 2018/7/27.
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++) {
            if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
