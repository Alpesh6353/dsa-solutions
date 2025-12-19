class Solution {
public:
    int peakIndexInMountainArray(vector<int>& arr) {
        int n = arr.size();
        int lo = 1;
        int hi = n-2;
        int idx = -1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>arr[mid-1]){
                if(arr[mid]>arr[mid+1]){
                     idx = mid;
                     break;
                     }
                else lo = mid+1;
            }
          else if(arr[mid]>arr[mid+1]) hi = mid-1;
        }
    return idx;
    }           
};