class Solution {
public:
    bool isPerfectSquare(int num) {
       int lo = 0;
       int hi = num/2;
       while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        long long  x = (long long)mid;
        long long y = (long long)num;
        if(x*x==y) return true;
        else if(x*x>y) hi = mid-1;
        else lo = mid+1;
       } 
       return false;
    }
};