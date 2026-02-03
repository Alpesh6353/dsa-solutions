class Solution {
public:
void parent(string ans,vector<string>& s,int open,int close,int n){
    if(ans.length()==2*n){
        if((open==n && close==n)){
        s.push_back(ans);
        }
        return;
    }
    parent(ans+"(",s,open+1,close,n);
    if(open>close){
    parent(ans+")",s,open,close+1,n);
    }
}
    vector<string> generateParenthesis(int n) {
        vector<string> s;
        parent("",s,0,0,n);
        return s;
    }
};