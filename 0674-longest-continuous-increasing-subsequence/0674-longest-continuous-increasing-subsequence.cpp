class Solution {
public:
    int findLengthOfLCIS(vector<int>& nums) {
        int n=nums.size();
        int currlen = 1;
        int maxlen = 1;
        for(int i=0;i<n-1;i++){
            if(nums[i]<nums[i+1]){
                currlen++;
            }
            else currlen = 1;
            maxlen = max(maxlen,currlen);
        }
        return  maxlen;
    }
};