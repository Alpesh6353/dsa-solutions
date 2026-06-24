class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n = cost.length;
        int minm = 0;
        int count = 0;
        for(int k=n-1;k>=0;k--){
            count++;
            if(count<=2) minm += cost[k];
            else count=0;
        }
        return minm;
    }
}