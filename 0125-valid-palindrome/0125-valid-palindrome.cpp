class Solution {
public:
    bool isPalindrome(string s) {
        int n = s.length();
        string ans = "";
        for(int i=0;i<n;i++){
            if((s[i]>='0' && s[i]<='9') || (s[i]>='A' && s[i]<='Z') || (s[i]>='a' && s[i]<='z')) {
                ans += tolower(s[i]);
            }
        }
        string a = ans;
        reverse(ans.begin(),ans.end());
        return ans==a;
    }
};