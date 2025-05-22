class Solution {
    public boolean checkValid(int[][] nums) {
        for(int i=0;i<nums.length;i++){
            Set<Integer>set=new HashSet<>();
            Set<Integer>set2=new HashSet<>();
            for(int j=0;j<nums.length;j++){
                set.add(nums[i][j]);
                set2.add(nums[j][i]);

            }
            if(set.size()!=nums.length)return false;
            if(set2.size()!=nums.length)return false;
        }
        return true;
    }
}