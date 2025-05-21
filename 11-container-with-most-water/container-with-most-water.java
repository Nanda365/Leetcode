class Solution {
public static int maxArea(int[] height) {
    int max = Integer.MIN_VALUE;
    int left = 0;
    int right = height.length - 1;
    while (left != right) {
        if (height[left] <= height[right]) {
            if (max < height[left]*(right-left)) {
                max = height[left]*(right-left);
            }
            left++;
        } else {
            if (max < height[right]*(right-left)) {
                max = height[right]*(right-left);
            }
            right--;
        }
    }
    return max;
}
}