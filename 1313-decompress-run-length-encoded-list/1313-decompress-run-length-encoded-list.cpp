class Solution {
public:
    vector<int> decompressRLElist(vector<int>& nums) {
        int n = nums.size();
        vector<int> v;
        int i=0;
        int j=1;
        while(j<n){
            int count = 0;
            while(count<nums[i]){
                v.push_back(nums[j]);
                count++;
            }
            i += 2;
            j += 2;
        }
        return v;
    }
};