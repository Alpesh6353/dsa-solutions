class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }
        if(i==m) while(j<n) arr[k++] = nums2[j++];
        if(j==n) while(i<m) arr[k++] = nums1[i++];
        if((m+n)%2!=0){
             double ans = (arr[(n+m)/2]);
             return ans;
             }
        else {
            int a = (m+n)/2;
            int b = a-1;
            double ans = (arr[a]+arr[b])/2.0;
            return ans;
        } 
    }
}