class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> v(n);
        int i=0;
        int j=1;
        int k = 0;
        while(n>i){
            if(nums[i]>0){
                v[k] = nums[i];
                k += 2;
            }
            else {
                v[j] = nums[i];
                j += 2;
            }
            i++;
        }
        return v;
    }
};