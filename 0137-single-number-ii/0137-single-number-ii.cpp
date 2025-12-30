class Solution {
public:
    int singleNumber(vector<int>& nums) {
        vector<bool> v(nums.size(),false);
        for(int i=0;i<nums.size();i++){
            if(v[i]==true) continue;
            int count =1;
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]==nums[j]){
                    count++;
                    v[j]=true;
                }
            }
            if(count !=3 ) return nums[i];
        }
        return -1;
    }
};