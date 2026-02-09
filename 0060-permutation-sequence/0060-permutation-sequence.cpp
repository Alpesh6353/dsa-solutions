class Solution {
public:
void per(string ans,string s,vector<string>& v){
    if(s==""){
        v.push_back(ans);
        return;
    }
    for(int i=0;i<s.length();i++){
        char ch = s[i];
        string left = s.substr(0,i);
        string right = s.substr(i+1);
        per(ans+ch,left+right,v);
    }
}
    string getPermutation(int n, int k) {
    if(n==1) return "1";
    string s ="";
    for(int i=1;i<=n;i++){
        s += to_string(i);
    }
    vector<string> v;
    per("",s,v);
    sort(v.begin(),v.end());
    return v[k-1];
    }
};