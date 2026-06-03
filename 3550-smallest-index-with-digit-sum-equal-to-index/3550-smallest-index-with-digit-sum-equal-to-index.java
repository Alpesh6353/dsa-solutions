class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int a = 0;
        int ld = 0;
        for(int i=0;i<n;i++){
            a = nums[i];
            if(a<10){
                if(i==a) return i;
                continue;
                }
            else {
                sum=0;
                while(a>0){
                    ld = a%10;
                    sum += ld;
                    a /= 10;
                }
                if(sum==i) return i;
            }
        }
        return -1;
    }
}