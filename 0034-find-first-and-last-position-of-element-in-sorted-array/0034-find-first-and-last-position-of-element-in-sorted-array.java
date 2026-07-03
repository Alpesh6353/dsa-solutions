class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];
        int lo = 0;
        int hi = n-1;
        int a = -1;
        int b = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid==0 && nums[mid]==target){
                a = mid;
                break;
            }
            else if(nums[mid]==target){
                if(nums[mid-1]==target) hi = mid-1;
                else {
                    a = mid;
                    break;
                }
            }
                else if(nums[mid]>target) hi = mid-1;
                else lo = mid+1;
        }
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(mid==n-1 && nums[mid]==target){
                b = mid;
                break;
            }
            else if(nums[mid]==target){
                if(nums[mid+1]==target) lo = mid+1;
                else {
                    b = mid;
                    break;
                }
            }
                else if(nums[mid]>target) hi = mid-1;
                else lo = mid+1;
        }
        arr[0] = a;
        arr[1] = b;
        return arr;
    }
}