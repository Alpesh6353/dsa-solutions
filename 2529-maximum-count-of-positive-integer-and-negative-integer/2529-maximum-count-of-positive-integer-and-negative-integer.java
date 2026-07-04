class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        // finding last negative index
        int lo = 0;
        int hi = n-1;
        int nidx = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]<0){
                nidx = mid;
                lo = mid+1;
            }
            else hi = mid-1;
        }
        //Now, finding first positive idx
        lo=0;
        hi=n-1;
        int pidx = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]>0){
                pidx = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        if(pidx == -1) pidx = 0;
        else  pidx = n-pidx;
        if(nidx == -1) nidx = 0;
        else nidx = nidx+1;
        return Math.max(pidx,nidx);
    }
}