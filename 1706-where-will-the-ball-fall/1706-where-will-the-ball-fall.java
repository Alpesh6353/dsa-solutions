class Solution {
    public int[] findBall(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[n];
        int k = 0;
        for(int l=0;l<n;l++){
            boolean stack = false;
            int i=0;
            int j=k;
            while(i<m && j<n){
                if(grid[i][j]==1){
                    if(j==n-1 || grid[i][j+1]==-1){
                    stack = true;
                    break;
                    }
                    else {
                        i++;
                        j++;
                    }
                }
                else{
                    if(j==0 || grid[i][j-1]==1){
                    stack = true;
                    break;
                    }
                    else {
                        i++;
                        j--;
                    }
                }
            }
            if(stack==true) ans[l] = -1;
            else ans[l] = j;
            k++;
        }
        return ans;
    }
}