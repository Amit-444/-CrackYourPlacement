// Permute two arrays such that sum of every pair is greater or equal to K
import java.util.*;

public class permuteTwoArrays {
    public static void reverse(int arr[]) {
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
    
    public static boolean isPossible(int k, int[] arr1, int[] arr2) {
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

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {3, 3, 3, 4};
        int k = 5;

        if(isPossible(k, arr1, arr2)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    } 
}
