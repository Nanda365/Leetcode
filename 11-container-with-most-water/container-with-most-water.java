class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int maxArea=0, CA=0;
        while(left<right){
            CA=(int)(Math.min(height[left],height[right])*(right-left));
            maxArea=Math.max(CA,maxArea);

            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}