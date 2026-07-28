class Solution:
    def maxProduct(self, n: int) -> int:
        max_val = 0
        sec_val = 0

        for i in str(n):
            digit = int(i)
            if digit>max_val:
                sec_val = max_val
                max_val = digit
            elif (digit>sec_val):
                sec_val = digit

        return max_val * sec_val