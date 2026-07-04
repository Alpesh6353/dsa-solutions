class Solution {
    ArrayList<Integer> find(int nums[], int target) {
        // code here
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int lo = 0;
        int hi = n-1;
        int a = -1;
        int b = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                    a = mid;
                    hi = mid-1;
            }
            else if(nums[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        lo=0;
        hi=n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target){
                    lo = mid+1;
                    b = mid;
            }
                else if(nums[mid]>target) hi = mid-1;
                else lo = mid+1;
        }
        ans.add(a);
        ans.add(b);
        return ans;
    }
}
