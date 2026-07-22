class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            if(piles[i]>max) max = piles[i];
            sum += piles[i];
        }
        int lo = 1;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            long hours = 0;
            int sum2 = 0;
            for(int i=0;i<n;i++){
                if(piles[i]%mid==0){
                    sum2 = piles[i]/mid;
                    hours += sum2;
                }
                else{
                    sum2 = piles[i]/mid + 1;
                    hours += sum2;
                }
            }
            if(hours<=h){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
}