class Solution {
public:
    int totalMoney(int n) {
        int sum = 0;
        int count = 0;
        while(n>0){
            if(n>=7){
                sum += (28 + count*7);
                n -= 7;
                count++;
            }
            else{
                sum += (n+count);
                n--;
            }
        }
        return sum;
    }
};