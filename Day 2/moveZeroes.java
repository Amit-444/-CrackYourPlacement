// 283. Move Zeroes

// optimal approach
class moveZeroes {
    public void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void movezeroes(int[] nums) {
        int j = -1;
        int size = nums.length;

        for(int i=0; i<size; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }
        if(j == -1) return;

        for(int i=j+1; i<size; i++) {
            if(nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }
}