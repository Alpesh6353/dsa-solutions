class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int n = arr.length;
        if(n==1) return;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int i=1;
        int j=0;
        while(i<n){
            ans[j] = arr[i];
            i+=2;
            j+=2;
        }
        i=0;
        j=1;
        while(j<n && i<n){
            ans[j] = arr[i];
            if(j<=n-2 && ans[j+1]==-1) j++;
            else if(j<=n-2 && ans[j+1]!=-1) j+=2;
            i+=2;
        }
        for(int k=0;k<n;k++){
            arr[k] = ans[k];
        }
    }
}
