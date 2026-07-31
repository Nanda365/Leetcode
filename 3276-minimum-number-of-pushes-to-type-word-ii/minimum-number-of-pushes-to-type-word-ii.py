class Solution:
    def minimumPushes(self, word: str) -> int:
        obj = {}

        for ch in word:
            if ch in obj:
                obj[ch]+=1
            else:
                obj[ch]=1
        values = []
        
        for key in obj:
            values.append(obj[key])
        values.sort(reverse=True)

        ans = 0
        for i in range(len(values)):
            ans+=(i//8+1)*values[i]
        
        return ans