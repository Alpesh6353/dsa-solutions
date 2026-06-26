class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ar = new int[m];
        int[] ac = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    ar[i] = 1;
                    ac[j] = 1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(ar[i]==1){
                for(int k=0;k<n;k++){
                    matrix[i][k]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(ac[i]==1){
                for(int k=0;k<m;k++){
                    matrix[k][i]=0;
                }
            }
        }

    }
}