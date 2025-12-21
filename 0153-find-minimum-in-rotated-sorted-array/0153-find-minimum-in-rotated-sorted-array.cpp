class Solution {
public:
    int findMin(vector<int>& arr) {
        int n = arr.size();
        if(n==2){
            if(arr[0]>arr[1]) return arr[1];
            else return arr[0];
        }
        int lo = 0;
        int hi = n-1;
        bool flag = false;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(mid==0) lo=mid+1;
            else if(mid==n-1) hi = mid-1;
            else if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
                flag = true;
                return arr[mid];
            }
            else if(arr[mid]>arr[mid+1]  && arr[mid]>arr[mid-1]){
                flag = true;
                return arr[mid+1];
            }
            else if(arr[mid]<arr[hi]) hi = mid-1;
            else lo=mid+1;
        }
        if(flag==false) return arr[0];
        else return -1;
    }
};