class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        if(arr[n-1]==n) return n+k;
        if(arr[0]-1 >= k) return k; 
        int lo=0;
        int hi=n-1;
        int cimi = -1;
        int mn = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            mn = arr[mid] - mid -1;
            if(mn>=k) hi = mid-1;
            else{
                lo = mid+1;
                cimi = mid;
            }
        }
        int a = arr[cimi] - cimi -1;
        return arr[cimi]+k-a;
    }
}