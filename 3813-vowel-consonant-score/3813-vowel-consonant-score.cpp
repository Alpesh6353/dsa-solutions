class Solution {
public:
    int vowelConsonantScore(string s) {
        int cons = 0;
        int vow = 0;
        for(int i=0;i<s.length();i++){
            if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
                vow++;
            }
            else if(s[i]==' ' || s[i]>'0' && s[i]<'9') continue;
            else cons++;
        }
        if(cons==0) return 0;
        else return floor(vow/cons);
    }
};