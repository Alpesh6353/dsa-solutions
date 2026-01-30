class Solution {
public:
void com(vector<int>& can,vector<vector<int>>& v,vector<int> ans,int target,int idx){
    if(target==0){
        v.push_back(ans);
        return;
    }
    if(target<0) return;
    for(int i=idx;i<can.size();i++){
        ans.push_back(can[i]);
        com(can,v,ans,target-can[i],i);
        ans.pop_back();
    }
}
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> v;
        vector<int> ans;
        com(candidates,v,ans,target,0);
        return v;
    }
};