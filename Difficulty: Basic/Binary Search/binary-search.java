class Solution {
    public boolean binarySearch(int[] arr, int k) {
        // code here
        int n = arr.length;
        int i=0,j=n-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            if(arr[mid]==k) return true;
            else if(arr[mid]<k) i = mid+1;
            else j = mid-1;
        }
        return false;
    }
}