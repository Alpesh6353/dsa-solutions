class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;   // number of rows
        int n = matrix[0].length; // number of columns
        int[][] arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = matrix[j][i];
            }
        }
        return arr;
    }
}