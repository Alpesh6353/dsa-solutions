class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        if(n==1) return 0;
        int lo = 1;
        int hi = n-2;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]<arr[mid+1]) lo = mid+1;
            else hi = mid-1;
        }
        if(arr[1]<arr[0]) return 0;
        else return n-1;
    }
}