class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
    int n = nums.size();
    vector<int> v;
     int i=0;
     while(i<n){
        int ci = nums[i]-1;
        if(ci==i) i++;
        else if(nums[i]==nums[ci]){
             if(!v.empty() && v.back()==nums[i]) v.pop_back();
             v.push_back(nums[i]);
             i++;
             }
        else swap(nums[i],nums[ci]);
     }
     return v;
    }
};