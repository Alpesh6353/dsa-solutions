class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max = nums[i];
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int div = 0;
            for(int i=0;i<n;i++){
                if(nums[i]%mid==0) div += nums[i]/mid;
                else div += nums[i]/mid +1;
            }
            if(div<=threshold){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}