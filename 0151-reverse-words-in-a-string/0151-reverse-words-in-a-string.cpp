class Solution {
public:
    string reverseWords(string s) {
        stringstream ss(s);
        vector<string> v;
        string temp;
        while(ss>>temp){
            v.push_back(temp);
        }
        string ans = "";
        for(int i=v.size()-1;i>=0;i--){
            if(i==0){
                ans = ans + v[i];
                break;
            }
            ans += (v[i]+" ");
        }
        return ans;
    }
};