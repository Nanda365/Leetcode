class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        while True:
            pro = 1
            num = n

            while num>0:
                pro*=num%10
                num//=10

            if pro%t==0:
                return n

            n+=1