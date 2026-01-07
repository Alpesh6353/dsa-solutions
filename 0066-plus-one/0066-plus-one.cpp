class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        int x = digits[n-1];
        x = x+1;
        if(x<9){
            digits[n-1] = x;
            return digits;
        }
        int y=0;
        while(x != 0){
            if(y==0){
                 digits[n-1] = x/10;
                 y++;
                 }
            else digits.push_back(x/10);
            x /= 10;
            
        }
        return digits;
    }
};