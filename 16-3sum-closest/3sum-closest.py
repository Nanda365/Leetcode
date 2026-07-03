class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        c = nums[0]+nums[1]+nums[2]
        for i in range(len(nums)):
            l = i+1
            r= len(nums)-1
            while (l<r):
                sum = nums[i]+nums[l]+nums[r]
                if(abs(sum-target)<abs(c-target)):
                    c=sum
                elif(sum>target):
                    r-=1
                elif(sum<target):
                    l+=1
                else:
                    return sum
        return c