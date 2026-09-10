class Solution {
    public int calPoints(String[] operations) {
        int n = operations.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(operations[i].equals("+")){
                int x = st.pop();
                int y = st.peek();
                st.push(x);
                st.push(x+y);
            }
            else if(operations[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else{
                String s = operations[i];
                int x = Integer.parseInt(s);
                st.push(x);
            }
        }
        int ans = 0;
        while(!st.isEmpty()) ans += st.pop();
        return ans;
    }
}