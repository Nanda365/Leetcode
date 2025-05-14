import java.util.*;
import java.math.BigInteger;

class Solution {
    public String multiply(String str1, String str2) {
        BigInteger num1 = new BigInteger(str1);
        BigInteger num2 = new BigInteger(str2);
        return num1.multiply(num2).toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Solution sol = new Solution();
        String result = sol.multiply(str1, str2);
        System.out.print(result);
    }
}
