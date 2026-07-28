class Solution:
    def hIndex(self, citations: List[int]) -> int:
        arr = sorted(citations,reverse=True)
        count = 0
        for i in range(len(arr)):
            if arr[i]>i:
                count+=1
            else:
                break

        return count

        