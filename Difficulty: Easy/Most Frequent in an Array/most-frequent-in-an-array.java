class Solution {
    public int mostFreqEle(int[] arr) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        int maxm = -1;
        int count = 1;
        int ans = -1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]) count++;
            else if(count>=maxm){
                ans = arr[i-1];
                maxm = count;
                count = 1;
            }
            else count=1;
        }
        if(count>=maxm){
                ans = arr[n-1];
                maxm = count;
        }
        return ans;
    }
}