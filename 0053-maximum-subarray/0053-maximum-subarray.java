class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int sum = 0;
        int i=0;
        while(n>i){
            if(sum==0) sum+=nums[i++];
            else if((sum<0)){
            if(nums[i]>sum) sum = nums[i];
            res = Math.max(res,sum);
            sum=0;
            continue;
            }
            else sum += nums[i++];
            if(sum>res) res = sum;
        }
        return res;
    }
}