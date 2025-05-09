class Solution(object):
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            num1=nums[i+1:]
            if (target-nums[i]) in num1:
                return [i,(num1.index(target-nums[i]))+i+1]
        