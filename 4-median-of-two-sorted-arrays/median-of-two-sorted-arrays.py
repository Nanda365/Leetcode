class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        merage = sorted(nums1+nums2)
        n=len(merage)
        
        if n%2==1:
            return float(merage[n//2])
        else:
            mid1=merage[n//2]
            mid2=merage[(n//2)-1]
            return float(mid1+mid2)/2