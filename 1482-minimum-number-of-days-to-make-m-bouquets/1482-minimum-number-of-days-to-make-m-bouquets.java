class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if((long)k*m>(long)n) return -1;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<bloomDay[i]) max = bloomDay[i];
            if(min>bloomDay[i]) min = bloomDay[i];
        }
        int lo = min;
        int hi = max;
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int count = 0;
            int flower = 0;
            for(int i=0;i<n;i++){
                if(bloomDay[i] <= mid){
                    count++;
                    if(count==k){
                        flower++;
                        count = 0;
                    }
                }
                else count = 0;
            }
            if(flower>=m){
                ans = mid;
                hi = mid - 1;
            }
            else {
               lo = mid + 1;
            }
        }
        return ans;
    }
}