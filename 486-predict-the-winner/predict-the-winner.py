class Solution:
    def predictTheWinner(self, nums: List[int]) -> bool:
        n = len(nums)
        map = {}

        def dfs(i,j):
            if i==j:
                return nums[i]
            
            if (i,j) in map:
                return map[(i,j)]

            left = nums[i] - dfs(i+1,j)
            right = nums[j] - dfs(i,j-1)

            map[(i,j)] = max(left,right)
            return map[(i,j)]
        return dfs(0, n - 1) >= 0