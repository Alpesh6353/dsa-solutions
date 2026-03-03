class Solution {
public:
    bool isprime(int n){
        if(n==1) return false;
        for(int i=2;i<=sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    int smallestValue(int n) {
        if(isprime(n)) return n;
        int sum=0;
        int i=2;
        int temp = n;
        while(temp != 1){
            while(temp%i==0){
                sum += i;
                temp /= i;
            }
            i++;
        }
        if(sum == n) return n;
        return smallestValue(sum);
    }
};