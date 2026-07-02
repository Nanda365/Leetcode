class Solution:
    def firstUniqChar(self, s: str) -> int:
        dic = {}

        for ch in s:
            if ch in dic:
                dic[ch]+=1
            else:
                dic[ch]=1
        
        newch = ""
        for key in dic:
            if(dic[key]==1):
                newch+=key
                break

        for ch in range(len(s)):
            if(newch==s[ch]):
                return ch
        return -1