class Solution {
    public long minimalKSum(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        int i=0;
        long j = 1;
        int c = 0;
        while(i<n && c<k){
            if(nums[i]<j) i++;
            else if(nums[i]==j){
                i++;
                j++;
            }
            else {
                sum += j;
                j++;
                c++;
            }
        }
        while(c<k){
            sum += j;
            j++;
            c++;
        }
        return sum;
    }
}