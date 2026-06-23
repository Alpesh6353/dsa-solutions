class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        int i = 0;
        int sum = 0;
        int minm = Integer.MAX_VALUE;
        while(n>i){
            int a = nums[i];
            while(a>0){
                int ld = a%10;
                sum += ld;
                a /= 10;
            }
            nums[i] = sum;
            minm = Math.min(sum,minm);
            sum=0;
            i++;
        }
        return minm;
    }
}