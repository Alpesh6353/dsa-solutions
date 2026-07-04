class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int ans = 0;
        if(n==1) return arr[0];
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(mid==0 && arr[mid] != arr[mid+1]) return arr[mid];
            else if(mid==n-1 && arr[mid] != arr[mid-1]) return arr[mid];
            else if(arr[mid]!=arr[mid+1] && mid%2==0){
                ans = arr[mid];
                hi = mid-1;
            }
            else if(arr[mid]==arr[mid+1] && mid%2==0) lo = mid+1;
            else if(arr[mid]==arr[mid-1] && mid%2==1) lo = mid+1;
            else hi = mid-1;
        }
        return ans;
    }
}