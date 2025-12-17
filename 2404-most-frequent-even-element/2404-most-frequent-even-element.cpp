class Solution {
public:
    int mostFrequentEven(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        
        int maxCount = 0;
        int currentCount = 0;
        int result = -1;
        
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] % 2 != 0) continue;
            
            if (i == 0 || nums[i] != nums[i-1]) {
                currentCount = 1;
            } else {
                currentCount++;
            }
            if (currentCount > maxCount || 
                (currentCount == maxCount && nums[i] < result)) {
                maxCount = currentCount;
                result = nums[i];
            }
        }
        
        return result;
    }
};
