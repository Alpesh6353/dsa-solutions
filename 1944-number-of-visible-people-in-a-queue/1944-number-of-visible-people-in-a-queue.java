class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        int count = 0;
        st.push(heights[n-1]);
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[i]>st.peek()){
                count++;
                st.pop();
            }
            if(st.size() > 0){
                count++;
                ans[i] = count;
            }
            else ans[i] = count;
            count = 0;
            st.push(heights[i]);
        }
        return ans;
    }
}