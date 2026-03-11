class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();
        int i=0;
        string s = "";
        while(i<n){
            char ch = chars[i];
            int count =1;
            while(i<n-1 && chars[i]==chars[i+1]){
                count++;
                i++;
            }
            if(count==1){
                s += ch;
            }
            else s += (ch + to_string(count));
            i++;
        }
        for(int i=0;i<s.length();i++){
            chars[i] = s[i];
        }
        return s.size();
    }
};