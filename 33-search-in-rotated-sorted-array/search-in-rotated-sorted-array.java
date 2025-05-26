class Solution {
    public int search(int[] nums, int target) {
        int pivot = largest(nums); 
        int s1 = 0, e1 = pivot;
        int s2 = pivot + 1, e2 = nums.length - 1;

        while (s1 <= e1) {
            int mid = s1 + (e1 - s1) / 2;
            if (nums[mid] < target)
                s1 = mid + 1;
            else if (nums[mid] > target)
                e1 = mid - 1;
            else
                return mid;
        }

        // Binary Search in second half
        while (s2 <= e2) {
            int mid = s2 + (e2 - s2) / 2;
            if (nums[mid] < target)
                s2 = mid + 1;
            else if (nums[mid] > target)
                e2 = mid - 1;
            else
                return mid;
        }

        return -1;
    }

    static int largest(int[] nums) {
        int s = 0, e = nums.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            mid = s + (e - s) / 2;

            if (mid < nums.length - 1 && nums[mid] > nums[mid + 1])
                return mid;

            if (mid > 0 && nums[mid] < nums[mid - 1])
                return mid - 1;

            if (nums[mid] < nums[s])
                e = mid - 1;
            else
                s = mid + 1;
        }

        return mid;
    }
}