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
        Arrays.sort(arr);
        if(arr[n]>0) return arr[n];
        else return 0;
    }
}