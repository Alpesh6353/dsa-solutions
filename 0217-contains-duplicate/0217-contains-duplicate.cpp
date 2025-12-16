class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int n=nums.size();
        sort(nums.begin(),nums.end());
        vector<int> v(n,0);
        int count=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            if(count>1) return true;
        }
        return false;
    }
};