class Solution {
    public int findLucky(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int count =1;
        int maxn = 0;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]) count++;
            else{
                if(arr[i-1]==count) maxn = Math.max(maxn,arr[i-1]);
                count = 1;
            }
        }
        if(arr[n-1]==count) maxn = Math.max(maxn,arr[n-1]);
        if(maxn != 0) return maxn;
        else return -1;
    }
}