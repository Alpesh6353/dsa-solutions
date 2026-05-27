class Solution {
public:
    int minimumSwaps(vector<int>& nums) {
      int n = nums.size()-1;
      int i = 0;
      int j = n;
      int count=0;
      while(j>i){
        if(nums[i]!=0) i++;
        if(nums[j]==0) j--;
        if(i>j) break;
        if(nums[i]==0 && nums[j]!=0){
            swap(nums[i],nums[j]);
            count++;
            i++;
            j--;
        }
      }  
      return count;
    }
};