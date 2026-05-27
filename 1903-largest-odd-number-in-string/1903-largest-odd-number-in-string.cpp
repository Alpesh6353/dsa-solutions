class Solution {
public:
    string largestOddNumber(string num) {
        int n = num.length()-1;
        int i = n;
        while(i>=0){
            if(num[i]%2!=0) return num;
            else{
                i--;
                num.pop_back();
                }
        }
        return "";
    }
};