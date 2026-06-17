class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int pro = 1;
        int ld = 0;
        while(n>0){
            ld = n%10;
            sum += ld;
            pro *= ld;
            n /= 10;
        }
        return pro - sum;
    }
}