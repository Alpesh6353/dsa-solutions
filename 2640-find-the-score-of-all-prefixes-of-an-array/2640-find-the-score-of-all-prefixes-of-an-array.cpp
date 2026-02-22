class Solution {
public:
int max(vector<int>& nums,int si,int ei){
    int max = INT_MIN;
    for(int i=si;i<=ei;i++){
        if(nums[i]>max) max=nums[i];
    }
    return max;
}
    vector<long long> findPrefixScore(vector<int>& nums) {
        int  n = nums.size();
        vector<long long> v(n);
        for(int i=0;i<n;i++){
            v[i] = nums[i]+max(nums,0,i);
        }
        for(int i=1;i<n;i++){
            v[i] += v[i-1];
        }
        return v;
    }
};