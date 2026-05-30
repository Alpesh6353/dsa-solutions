class Solution {
public:
    bool isAdjacentDiffAtMostTwo(string s) {
        int n = s.length();
        for(int i=0;i<n-1;i++){
            int x = s[i] - '0';
            int y = s[i+1] - '0';
            if(abs(x-y)<=2) continue;
            else return false;
        }
        return true;
    }
};