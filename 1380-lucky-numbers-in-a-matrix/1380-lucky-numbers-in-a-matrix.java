class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int c=-1;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            int minm = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(minm>matrix[i][j]){
                    minm = matrix[i][j];
                    c = j;
                    }
            }
            int maxm = -1;
            for(int k=0;k<m;k++){
                    if(matrix[k][c]>maxm) maxm = matrix[k][c];
                }
            if(maxm==minm){
                ans.add(maxm);
                break;
            }
        }
        return ans;
    }
}