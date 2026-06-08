class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n = nums.length;
        int i=0;
        while(n>i){
            if(nums[i]==original){
                original*=2;
                i = 0;
            }
            else i++;
        }
        return original;
    }
}