class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i=1;
        nums[k++] = nums[0];
        while(n>i){
            if(nums[k-1]!=nums[i])  nums[k++] = nums[i++];
            else i++;
        }
        return k;
    }
}