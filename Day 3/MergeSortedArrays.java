// 88. Merge Sorted Array

// Bruteforce Approach
// public class MergeSortedArrays {
//     public void merge(int[] a, int m, int[] b, int n) {
//         int ans[] = new int[m+n];
//         int count = 0;
//         int i = 0;
//         int j = 0;

//         while(i < m && j < n) {
//             if(a[i] <= b[j]) {
//                 ans[count++] = a[i];
//                 i++;
//             }
//             else {
//                 ans[count++] = b[j];
//                 j++;
//             }
//         }

//         while(i < m) {
//             ans[count++] = a[i++];
//         }

//         while(j < n) {
//             ans[count++] = b[j++];
//         }

//         for(int ind=0; ind<m+n; ind++) {
//             a[ind] = ans[ind];
//         }
//     }
// }




// Optimal Approach(Gap Method)
// TC : O(m+n) & SC : O(1);
public class MergeSortedArrays {
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0; i<n; i++) {
            nums1[m+i] = nums2[i];
        } 

        int len = (m + n);
        int gap = (len / 2) + (len % 2);

        while(gap > 0) {
            int left = 0;
            int right = left + gap;

            while(right < len) {
                if(nums1[left] > nums1[right]) {
                    swap(nums1, left, right);
                }
                left ++;
                right ++;
            }
            if(gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}


