class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        if (sum(nums)<target):
            return 0
        l = 0
        min_len = float("inf")
        summation = 0
        for r in range(len(nums)):
            summation+=nums[r]
            while(summation>target):
                    
                if summation>=target:
                    min_len = min(r-l+1,min_len)
                summation-=nums[l]
                l+=1  
                
            if summation>=target:
                min_len = min(r-l+1,min_len)
  
        return min_len

        