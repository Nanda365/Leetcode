class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i ++) {
            int start = arr.length - i;
            int end = i + 1;
            int total = start * end;
            int oddSub = total / 2;

            if (total % 2 != 0) {
                oddSub ++;
            }

            sum += oddSub * arr[i];
        }

        return sum;
    }
}