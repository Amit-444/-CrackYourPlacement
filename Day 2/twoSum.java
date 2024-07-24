// 1. Two Sum
import java.util.*;


class twoSum {
    public int[] twooSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans[] = {-1, -1};

        for(int i=0; i<nums.length; i++) {
            int req = target - nums[i];
            if(map.containsKey(req)) {
                int temp[] = {i, map.get(req)};
                return temp;
            }
            else {
                map.put(nums[i], i);
            }
        }

        return ans;
    }
}