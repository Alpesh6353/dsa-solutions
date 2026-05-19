class Solution {
    public int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int a=0;
        int b=1;
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}