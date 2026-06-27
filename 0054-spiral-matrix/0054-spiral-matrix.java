class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> ans = new ArrayList<>();
        int sr=0,er=m-1,sc=0,ec=n-1;
        while(er>=sr && sc<=ec){
            for(int i=sc;i<=ec;i++){
                ans.add(mat[sr][i]);
            }
            sr++;
            if(sr>er || sc > ec) break;
            for(int j=sr;j<=er;j++){
                ans.add(mat[j][ec]);
            }
            ec--;
            if(sr>er || sc > ec) break;
            for(int i=ec;i>=sc;i--){
                ans.add(mat[er][i]);
            }
            er--;
            if(sr>er || sc > ec) break;
            for(int j=er;j>=sr;j--){
                ans.add(mat[j][sc]);
            }
            sc++;
            if(sr>er || sc > ec) break;
        }
        return ans;
    }
}