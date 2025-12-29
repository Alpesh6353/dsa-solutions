class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> v;
        for(int i=0;i<=numbers.size();i++){
            int lo = i+1;
            int hi = numbers.size()-1;
            while(lo<=hi){
                int mid = lo +(hi-lo)/2;
                if(numbers[mid]+numbers[i]==target){
                  v.push_back(i+1);
                  v.push_back(mid+1);
                  break;
                }
                else if(numbers[mid]+numbers[i]<target) lo=mid+1;
                else hi = mid-1;
            }
        }
        return v;
    }
};