class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int sum = 0;
        for(int i=Math.max(1,n-k);i<=n+k;i++){
            int a = n-i;
            if(a<0) a =-1*a;
            if(a<=k && ((n&i)==0)) sum+=i;
        }
        return sum;
    }
}