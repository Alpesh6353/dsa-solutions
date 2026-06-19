class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int arr[] =  new int[n+1];
        int i=1;
        int j=2;
        arr[1] = gain[0];
        while(i<n){
            arr[j] = gain[i] + arr[j-1];
            i++;
            j++;
        }
       int max = Integer.MIN_VALUE;
       for(int k=0;k<=n;k++){
        if(arr[k]>max) max = arr[k];
       }
       return max;
    }
}