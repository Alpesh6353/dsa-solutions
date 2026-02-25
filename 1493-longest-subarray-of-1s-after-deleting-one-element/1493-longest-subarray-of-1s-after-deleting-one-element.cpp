class Solution {
public:
    int longestSubarray(vector<int>& nums) {
        int n = nums.size();
        int i=0;
        int j=0;
        int maxlen = INT_MIN;
        int length = INT_MIN;
        int flip=0;
        int k=1;
        while(j<n){
            if(nums[j]==1) j++;
            else {
                if(k>flip){
                flip++;
                j++;
                }
            else { //flip==k
                length = j-i;
                maxlen = max(maxlen,length);
                 // i ko just aage eale 0 se ek aage le jaao;
                   while(nums[i]==1) i++; //after this nums[i]=0
                   i++;
                   j++;
            }
            }
        }
         length = j-i;
         maxlen = max(maxlen,length);
        return maxlen-1;
        
    }
};