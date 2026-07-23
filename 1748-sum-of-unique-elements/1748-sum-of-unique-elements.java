class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n==1) return nums[0];
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += nums[i];
        }
        int j = 0;
        while(j<n-1){
            int count = 1;
            while(j<n-1 && nums[j]==nums[j+1]){
                count++;
                j++;
                }
            if(count>1){
                sum -= count*nums[j];
            }
            j++;
        }
        // if(nums[n-1] != nums[n-2]) sum += nums[n-2];
        return sum;
    }
}