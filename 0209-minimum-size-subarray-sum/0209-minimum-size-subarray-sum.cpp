class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        
        int total = 0;
        for (int x : nums) total += x;
        if (total < target) return 0;

        int l = 0;
        int min_len = INT_MAX;
        int summation = 0;

        for (int r = 0; r < nums.size(); r++) {
            summation += nums[r];

            while (summation > target) {
                if (summation >= target) {
                    min_len = min(min_len, r - l + 1);
                }
                summation -= nums[l];
                l++;
            }

            if (summation >= target) {
                min_len = min(min_len, r - l + 1);
            }
        }

        return min_len;
    }
};