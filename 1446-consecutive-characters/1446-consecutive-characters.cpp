class Solution {
public:
    int maxPower(string s) {
        int n = s.length();
        if(n==1) return 1;
        int maxc = 0;
        int count = 1;
        for(int i=1;i<n;i++){
            if(s[i]==s[i-1]) count++;
            else count=1;
            maxc = max(maxc,count);
            }
        return maxc;
    }
};