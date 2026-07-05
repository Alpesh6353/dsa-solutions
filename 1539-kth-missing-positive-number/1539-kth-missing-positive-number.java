class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo=0;
        int hi=n-1;
        int mn = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            mn = arr[mid] - mid -1;
            if(mn>=k) hi = mid-1;
            else lo = mid+1;
        }
        return lo+k;
    }
}