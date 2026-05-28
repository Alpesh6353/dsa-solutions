class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> v(n);
        int i=0;
        int j=1;
        int k = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){ // for even
                v[k] = nums[i];
                k += 2;
            }
            else {  // for odd
                v[j] = nums[i];
                j += 2;
            }
        }
        return v;
    }
};