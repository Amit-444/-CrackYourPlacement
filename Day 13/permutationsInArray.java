// Permutations in array
import java.util.*;

public class permutationsInArray {
    public void reverse(int arr[]) {
        int i = 0;
        int j = arr.length - 1;
        
        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    
    public boolean isPossible(int k, int[] arr1, int[] arr2) {
        // Your code goes here.
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        reverse(arr2);
        
        for(int i=0; i<arr1.length; i++) {
            int sum = arr1[i] + arr2[i];
            
            if(sum < k) {
                return false;
            }
        }
        
        return true;
    }
}
