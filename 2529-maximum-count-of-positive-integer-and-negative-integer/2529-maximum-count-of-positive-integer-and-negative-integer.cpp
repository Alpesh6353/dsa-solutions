class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int ne=0;
        int po=0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0) continue;
            if(nums[i]>0) po++;
            else ne++;
        }
        if(po==ne) return po;
        else if(po>ne) return po;
        else return ne;
    }
};