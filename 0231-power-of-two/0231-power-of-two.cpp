class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n<=0) return false;
        bool flag = true;
       while(n>1){
        if(n%2==0){
            n =  n/2;
             }
        else {
            flag = false;
            break;
        }
       }
       if(flag==true) return true;
       else return false;
    }
};