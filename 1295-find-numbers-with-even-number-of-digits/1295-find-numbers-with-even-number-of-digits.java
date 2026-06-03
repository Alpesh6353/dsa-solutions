class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;
        int c = 0;
        int a = 0;
        for(int i=0;i<n;i++){
            a = nums[i];
            if(a<10) continue;
            else {
                c = 0;
                while(a>0){
                   c++;
                   a /= 10;
                }
                if(c%2==0) count++;
            }
        }
        return count;
    }
}