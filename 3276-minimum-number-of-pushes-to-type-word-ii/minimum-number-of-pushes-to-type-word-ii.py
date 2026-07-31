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

        res = 0
        arr=[]
        for i in range(len(keys)):
            res=i//8+1
            arr.append(res)

        ans = 0
        for i in range(len(keys)):
            ans+=arr[i]*values[i]
        
        return ans