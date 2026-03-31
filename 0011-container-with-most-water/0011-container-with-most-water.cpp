class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int left = 0;
        int right = n-1;
        int maxw = INT_MIN;
        int Area = 0;
        while(right>left){
           Area = min(height[left],height[right]) * (right - left);
           maxw = max(maxw,Area);
           if(height[left]>=height[right]) right--;
           else left++;
        }
        return maxw;
    }
};