class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>> ans = new ArrayList();
        if(k>=m*n) k = k%(m*n);
        while(k>0){
            int temp = grid[m-1][n-1];
            for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=1;j--){
                grid[i][j] = grid[i][j-1];
            }
            if(i>0) grid[i][0] = grid[i-1][n-1];
        }
        grid[0][0] = temp;
        k--;
        }
        for(int i=0;i<m;i++){
            ans.add(new ArrayList<>()); 
            for(int j=0;j<n;j++){
                 ans.get(i).add(grid[i][j]);
            }
        }
        return ans;
    }
}