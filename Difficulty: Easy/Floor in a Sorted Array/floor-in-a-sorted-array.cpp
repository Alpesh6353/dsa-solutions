class Solution {
  public:
    int findFloor(vector<int>& arr, int x) {
        // code here
        int n = arr.size();
        int lo=0;
        int hi=n-1;
        int k = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==x){
                k = mid;
                lo = mid+1;
            }
            else if(arr[mid]>x) hi = mid-1;
            else lo = mid+1;
        }    
        if(k==-1) return hi;
        else return k;
    }
};
