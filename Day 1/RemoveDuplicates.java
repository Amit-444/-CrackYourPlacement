// 26. Remove Duplicates from Sorted Array

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int count = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[count] = nums[i];
                count ++;
            }
        }
        return count;
    }
}