class Solution:
    def reverseString(self, s: List[str]) -> None:
        reverse = []

        for i in range(len(s) - 1, -1, -1):
            reverse.append(s[i])

        for i in range(len(s)):
            s[i] = reverse[i]