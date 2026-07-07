class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long ans = 0;
        long sum = 0;
        long power = 0;
        long v = 10;
        while(n>0){
            while(n>0 && n%10==0) n /= 10;
            if(n==0) break;
            long ld = n%10;
            sum += ld;
            ans = (ans + ld*(long)Math.pow(v,power));
            power++;
            n /= 10;
        }
        return sum*ans;
    }
}