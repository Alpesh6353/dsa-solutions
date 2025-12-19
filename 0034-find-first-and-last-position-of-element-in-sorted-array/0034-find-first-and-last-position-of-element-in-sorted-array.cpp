class Solution {
public:
    vector<int> searchRange(vector<int>& arr, int target) {
    vector<int> v(2,-1);
    int n = arr.size();
    int lo = 0;
    int hi = n-1;
    while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target){
            v[0]=mid;
            hi=mid-1;
        }
        else if(arr[mid]>target){
            hi = mid-1;
        }
        else lo = mid+1;
    }
    lo=0,hi=n-1;
    while(lo<=hi){
        int mid = lo+(hi-lo)/2;
        if(arr[mid]==target){
            v[1]=mid;
            lo=mid+1;
        }
        else if(arr[mid]>target){
            hi = mid-1;
        }
        else lo = mid+1;
    }
    return v;
    }
};