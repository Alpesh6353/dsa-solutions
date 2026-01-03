class Solution {
public:
    int specialArray(vector<int>& nums) {
        int n = nums.size();
        if(nums[0]>=n) return n;
        sort(nums.begin(),nums.end());
        for(int i=1;i<n;i++){
            int len = n-i;
            if(nums[i]>=len && nums[i]!=nums[i-1] && len>nums[i-1]) return len;
            // else if( nums[i]-1==len) return len;
        }
        return -1;
    }
};