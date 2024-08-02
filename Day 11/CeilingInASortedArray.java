// Ceiling in a sorted array

public class CeilingInASortedArray {
    public static int ceilingVal(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            
            if(arr[mid] == x) {
                ans = arr[mid];
                start = mid + 1;
            }
            else if(arr[mid] > x) {
                ans = arr[mid];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 19;

        System.out.println("The Ceilling value of " + x + " is : " + ceilingVal(arr, x));
    }
}
