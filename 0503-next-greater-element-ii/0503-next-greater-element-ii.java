class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=n-1;i>=0;i--){
            st.push(nums[i]);
        }
        int j = n-1;
        for(int i=n-1;i>=0;i--){
            while(st.size() > 0 && st.peek() <= nums[i]) st.pop();
            if(st.size()>0) ans[j] = st.peek();
            else ans[j] = -1;
            j--;
            st.push(nums[i]);
        }
        return ans;
    }
}