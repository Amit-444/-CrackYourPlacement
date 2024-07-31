// Product array puzzle

public class productArrayPuzzle {
    
    // Bruteforce Approach
    // public static long[] productExceptSelf(int nums[], int n) { 
	//     long ans[] = new long[n];
    //     for(int i=0; i<nums.length; i++) {
    //         long temp = 1;
    //         for(int j=0; j<n; j++) {
    //             if(i == j) continue;
    //             temp *= (long)nums[j];
    //         }
    //         ans[i] = temp;
    //     }
        
    //     return ans;
	// } 


    // Optimal Approach
    public static long[] productExceptSelf(int arr[], int n) { 
        long left[] = new long[n];
        long right[] = new long[n];
        
        left[0] = 1;
        for(int i=1; i<n; i++) {
            left[i] = left[i-1] * arr[i-1];
        }
        
        right[n-1] = 1;
        for(int i=n-2; i>=0; i--) {
            right[i] = right[i+1] * arr[i+1];
        }
        
        long ans[] = new long[n];
        for(int i=0; i<n; i++) {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
	}
}