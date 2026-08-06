class Solution {
    public int smallestNumber(int n, int t) {
        int a = n;
        boolean flag = true;
        while(flag==true){
            int c = n;
            int product = 1;
            while(n>0){
                int ld = n%10;
                product = product*ld;
                n /= 10;
            }
            if(product%t==0) return c;
            n = ++a;
        }
        return 0;
    }
}