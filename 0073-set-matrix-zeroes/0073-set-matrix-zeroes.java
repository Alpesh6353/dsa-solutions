class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int k=0;k<n;k++){
                        res[i][k] = 1;
                    }
                    for(int k=0;k<m;k++){
                        res[k][j] = 1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(res[i][j]==1) matrix[i][j] = 0;
            }
        }
    }
}