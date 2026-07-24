class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n =  nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            int lo = 0;
            int hi = n-1;
            while(lo<=hi){
                int mid = lo + (hi - lo)/2;
                if(arr[mid]==nums[i]) hi = mid-1;
                else if(arr[mid]>nums[i]) hi = mid-1;
                else lo = mid+1;
            }
            ans[i] = lo;
        }
        return ans;
    }
}