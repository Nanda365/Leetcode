class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            // Ensure mid points to the first element of the pair
            if (mid % 2 == 1) mid--;

            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; // Unique is after this pair
            } else {
                high = mid; // Unique is before or at mid
            }
        }
        
        return nums[low];
    }
}