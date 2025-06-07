class Solution {
    public String gcdOfStrings(String str1, String str2) {

        if(!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int len1 = str1.length();
        int len2 = str2.length();

        String ans = str1.substring(0, gcd(len1, len2));

        return ans;
    }

    public int gcd(int len1, int len2) {
        return (len2 == 0) ? len1 : gcd(len2, len1 % len2);
    }
} 