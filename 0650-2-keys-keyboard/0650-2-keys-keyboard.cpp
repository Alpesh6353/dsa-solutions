class Solution {
public:
    bool isprime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    int minSteps(int n) {
        if(n==1) return 0;
        if(isprime(n)) return n;
        int i=2;
        int sum=0;
        while(n != 1){
            while(n%i==0){
                sum += i;
                n /= i;
            }
            i++;
        }
        return sum;
    }
};