// 628. Maximum Product of Three Numbers
import java.util.*;

public class maxProductOfThreeNums {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        int ans1 = nums[size-1] * nums[size-2] * nums[size-3];
        int ans2 = nums[0] * nums[1] * nums[size-1];

        return Math.max(ans1, ans2);
    }
}
