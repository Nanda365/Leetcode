class Solution {
    public boolean isPerfectSquare(int num) {
        int Sqrt=(int) Math.sqrt(num);
        if(Sqrt*Sqrt==num){
            return true;
        }
        return false;
    }
}