// Smallest Positive Missing
import java.util.*;

public class smallestPositiveMissing {
    static int missingNumber(int arr[], int size) {
        // Your code here
        Arrays.sort(arr);
        int ans = 1;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ans){
                ans++;
            }
        }
        
        return ans;
    }
}
