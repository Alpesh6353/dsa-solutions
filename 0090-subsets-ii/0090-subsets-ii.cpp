class Solution {
public:
void subset(vector<int>& nums,vector<vector<int>>& ans,vector<int> v,bool flag,int idx){
    if(idx==nums.size()){
        ans.push_back(v);
        return;
    }
    if(nums.size()==1){
        if(flag==true) subset(nums,ans,v,true,idx+1);
        v.push_back(nums[idx]);
        subset(nums,ans,v,true,idx+1);
        return;
    }
    if( nums.size()>idx+1 &&nums[idx]==nums[idx+1]){
        if(flag==true) subset(nums,ans,v,true,idx+1);
        v.push_back(nums[idx]);
        subset(nums,ans,v,false,idx+1);
    }
    else {
        if(flag==true) subset(nums,ans,v,true,idx+1);
        v.push_back(nums[idx]);
        subset(nums,ans,v,true,idx+1);
    }
}
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        vector<int> v;
        subset(nums,ans,v,true,0);
        return ans;
    }
};