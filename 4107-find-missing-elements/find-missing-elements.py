class Solution:
    def findMissingElements(self, nums: List[int]) -> List[int]:
        n = len(nums)
        min_val = nums[0]
        max_val = nums[0]
        res = []
        for num in nums:
            if(num<min_val):
                min_val = num
            if(num>max_val):
                max_val = num

        for val in range(min_val,max_val):
            if val not in nums:
                res.append(val)
        
        return sorted(res)