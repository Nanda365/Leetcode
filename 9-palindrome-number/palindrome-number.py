class Solution(object):
    def isPalindrome(self, x):
        reverse = str(x)[::-1]
        if str(x)==reverse:
            return True
        else:
            return False
        