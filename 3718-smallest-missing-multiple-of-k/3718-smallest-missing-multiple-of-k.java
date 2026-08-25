import java.util.Arrays;

class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int j = 1; 
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            if (nums[i] % k == 0) {
                if (nums[i] == k * j) {
                    j++;
                } else if (nums[i] > k * j) {
                    return k * j;
                }
            }
        }
        
        return k * j;
    }
}
