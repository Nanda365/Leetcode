class Solution:
    def minimumPushes(self, word: str) -> int:
        obj = {}

        for ch in word:
            if ch in obj:
                obj[ch]+=1
            else:
                obj[ch]=1

        keys = ""
        values = []
        
        for key in obj:
            keys+=key
            values.append(obj[key])
        values.sort(reverse=True)

        ans = 0
        for i in range(len(keys)):
            ans+=(i//8+1)*values[i]
        
        return ans