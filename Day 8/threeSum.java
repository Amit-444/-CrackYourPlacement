// 15. 3Sum
import java.util.*;

public class threeSum {
    // For Bruteforce we can solve it using 3 nested loops...Store the ansLists in a set(avoids duplicate) 

    
    // Most Optimal way
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;

            int j = i+1;
            int k = arr.length - 1;
            while(j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
                else if(sum < 0) {
                    j++;
                }
                else {
                    k--;
                }
            } 
        }

        return ans;
    }
}
