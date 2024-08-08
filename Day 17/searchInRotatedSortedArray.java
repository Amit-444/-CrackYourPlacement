// 33. Search in Rotated Sorted Array

public class searchInRotatedSortedArray {
    public static int getPivot(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while(start < end) {
            mid = start + (end - start)/2;

            if(arr[mid] >= arr[0]) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }

        return start;
    }

     public static int binarySearch(int arr[], int start, int end, int target) {
        int mid;

        while(start <= end) {
            mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public int search(int[] arr, int target) {
        int pivot = getPivot(arr);

        if(target >= arr[pivot] && target <= arr[arr.length-1]) {
            return binarySearch(arr, pivot, arr.length-1, target);
        }
        else {
            return binarySearch(arr, 0, pivot, target);
        }
    }
}
