class Solution:
    def isPalindrome(self, s: str) -> bool:
        st = ""

        for ch in s:
            if ch.isalnum():
                st+=ch.lower()

        rev = ""
        for i in range(len(st)-1,-1,-1):
            rev+=st[i]
        return st==rev