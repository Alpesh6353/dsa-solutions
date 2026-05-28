class Solution {
public:
    vector<int> limitOccurrences(vector<int>& nums, int k) {
        int n = nums.size()-1;
        vector<int> v;
        int i=0;
        while(n>=i){
            int count = 0;
            for(int j=i;j<=n;j++){
                if(nums[i]==nums[j]){
                    count++;
                    if(count<=k){
                        v.push_back(nums[i]);
                    }
                }
            }
            i = i+count;
        }
        return v;
    }
};