class Solution {
public:
    int findDuplicate(vector<int>& nums) {
     int n = nums.size();
     int i=0;
     while(i<n){
        int ci = nums[i];
        if(nums[i]==nums[ci]) return nums[ci];
        else if(ci==i) i++;
        else swap(nums[i],nums[ci]);
     }
     return 100;
    }
};