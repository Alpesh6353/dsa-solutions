class Solution {

    public static int getMaxArea(int arr[]) {
        // code here
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        nse[n-1] = n;
        st.push(n-1);
        for(int i=n-2;i>=0;i--){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() > 0) nse[i] = st.peek();
            else nse[i] = n;
            st.push(i);
        }
        while(st.size() > 0) st.pop();
        int[] pse = new int[n];
        pse[0] = -1;
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size() > 0 && arr[st.peek()] >= arr[i]) st.pop();
            if(st.size() > 0) pse[i] = st.peek();
            else pse[i] = -1;
            st.push(i);
        }
        
        int maxArea = 0;
        for(int i=0;i<n;i++){
            int area = arr[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea,area);
        }
        return maxArea;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length; // rows
        int m = matrix[0].length; //column
        int[][] Ans = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]=='0') Ans[i][j]=0;
                else Ans[i][j] = 1;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(Ans[j-1][i] != 0 && Ans[j][i] != 0) Ans[j][i] += Ans[j-1][i];
            }
        }
        int maxm = 0;
        int[] ans = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[j] = Ans[i][j];
            }
           int Area = getMaxArea(ans);
           maxm = Math.max(Area,maxm);
        }
        return maxm;
    }
}