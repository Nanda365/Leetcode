class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int ans=0;

        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                count++;
            }
        }
        ans=count;

        for(int i=k;i<s.length();i++){
            char chi=s.charAt(i);
            char chik=s.charAt(i-k);

            if(isvowel(chi)){
                count++;
            }
            if(isvowel(chik)){
                count--;
            }
            ans=Math.max(ans,count);
        }
        return ans;
        }

        public boolean isvowel(char ch){
            if(ch=='a'){
                return true;
            }else if(ch=='e'){
                return true;
            }else if(ch=='i'){
                return true;
            }else if(ch=='o'){
                return true;
            }else if(ch=='u'){
                return true;
            }else{
                return false;
            }
       
    }
}