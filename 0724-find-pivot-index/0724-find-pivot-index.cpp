class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int n = nums.size();
        // int left[n];
        // int right[n];
        // left[0] = nums[0];
        // right[n-1] = nums[n-1];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum = sum + nums[j];
            }
            int ssum=0;
            for(int k=i+1;k<n;k++){
                ssum = ssum + nums[k];
            }
            if(sum==ssum) return i;
        }
        return -1;
    }
};