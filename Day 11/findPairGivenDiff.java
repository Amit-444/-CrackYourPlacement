// Find Pair Given Difference
import java.util.*;

public class findPairGivenDiff {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i = 0;
        int j = 1;
        
        while(i < n && j < n) {
            int diff = (arr[j] - arr[i]);
            if(i != j && diff == x) {
                return 1;
            }
            else if(diff < x) {
                j++;
            }
            else {
                i++;
            }
        }
        
        return -1;
    }
}
