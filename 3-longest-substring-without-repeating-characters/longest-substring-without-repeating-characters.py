class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        map = {}
        left = 0
        maxlength = 0

        for right in range(len(s)):
            if(s[right] in map and map[s[right]] >= left):
                left = map[s[right]] + 1

            map[s[right]] = right

            if((right-left+1)>maxlength):
                maxlength = right-left+1

        return maxlength