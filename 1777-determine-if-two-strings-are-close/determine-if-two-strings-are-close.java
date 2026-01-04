class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int[] fer1=new int[26];
        int[] fer2=new int[26];

        for(char ch:word1.toCharArray()){
            fer1[ch-'a']++;
        }
        for(char ch:word2.toCharArray()){
            fer2[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if((fer1[i]==0 && fer2[i]!=0) || (fer2[i]==0 && fer1[i]!=0)){
                return false;
            }
        }
        Arrays.sort(fer1);
        Arrays.sort(fer2);
        return Arrays.equals(fer1,fer2);
    }
}