// 462. Minimum Moves to Equal Array Elements II
import java.util.*;

public class minimumMovesToEqualArrayElementII {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int mid = (0 + nums.length - 1) / 2;

        for(int i=0; i<nums.length; i++) {
            count += Math.abs(nums[mid] - nums[i]);
        }

        return count;
    }
}
