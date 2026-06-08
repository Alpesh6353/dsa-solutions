class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;
        int maxm = -1;
        int k = -1;
        boolean flag = true;
        for(int i=0;i<n;i++){
        if(nums[i]>maxm){
            maxm = nums[i];
            k=i;
         }
        }
        for(int i = 0; i < n; i++) {
            if(i != k && nums[i] * 2 > maxm) { 
                flag = false;
                break;
            }
        }
        if(flag) return k;
        else return -1;
    }
}