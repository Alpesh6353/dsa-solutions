class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;
        while(n>i && n>j){
            if(nums[i]%2==0) i+=2;
            else if(nums[j]%2!=0) j+=2;
            else if(nums[i]%2!=0 && nums[j]%2==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i+=2;
                j+=2;
            }
        }
        return nums;
    }
}