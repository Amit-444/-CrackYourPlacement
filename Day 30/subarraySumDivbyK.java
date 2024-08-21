// 974. Subarray Sums Divisible by K
import java.util.*;

public class subarraySumDivbyK {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        countMap.put(0, 1);
        int ans = 0;
        int sum = 0;
        
        for (int num : nums) {
            sum = ((sum + num) % k + k) % k;
            ans += countMap.getOrDefault(sum, 0);
            countMap.merge(sum, 1, Integer::sum);
        }
        
        return ans;
    }
}
