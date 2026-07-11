class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length; // length of weights array
        int totalsum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(weights[i]>max) max = weights[i];
            totalsum += weights[i];
        }
        int lo = max;
        int hi = totalsum;
        int ans=0;
        while(lo<=hi){
            int currentsum = 0;
            int currentdays = 0;
            int mid = lo + (hi-lo)/2;
            for(int i=0;i<n;i++){
                if(currentsum + weights[i] <= mid){
                    currentsum += weights[i];
                }
                else {
                    currentdays++;
                    currentsum  = 0;
                    currentsum += weights[i];
                }
            }
            currentdays++;
            if(currentdays<=days){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}