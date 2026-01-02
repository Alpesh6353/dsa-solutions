class Solution {
public:
    string toLowerCase(string s) {
        string ans ="";
        for(char ch : s){
            if(ch>='A' && ch<='Z'){
                ch = ch + 32;
                ans =  ans+ch;
            }
            else ans = ans+ch;
        }
        return ans;
    }
};