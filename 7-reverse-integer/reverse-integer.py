class Solution:
    def reverse(self, x: int) -> int:

        sign = 1
        if x < 0:
            sign = -1
            x = -x
        x = str(x)
        result = ""
        for i in range(len(x)-1, -1, -1):
            result += x[i]
        ans = int(result) * sign
        if ans < -2**31 or ans > 2**31 - 1:
            return 0
        return ans