class Solution {
public:
    int thirdMax(vector<int>& nums) {
        int n = nums.size();
        long long max = LLONG_MIN;
        for(int i=0;i<n;i++){
            if(nums[i]>max) max = nums[i];
        }
        long long smax = LLONG_MIN;
        bool flag1 = false;
        for(int i=0;i<n;i++){
            if(nums[i]>smax  && nums[i] != max ) {
                smax = nums[i];
                flag1 = true;
            }
        }
        if (!flag1) return (int) max;
        long long tmax = LLONG_MIN;
        bool flag = false;
        for(int i=0;i<n;i++){
            if(nums[i]>tmax && (nums[i] != max && nums[i] != smax)) {
            tmax = nums[i];
            flag = true;
            }
        }
        return (flag ? (int) tmax : (int) max);
    }
};