class Solution {
    public String removeDuplicates(String s) {
       int n = s.length();
       if(n==1) return s;
       Stack<Character> st = new Stack<>();
       st.push(s.charAt(0));
       char ch;
       for(int i=1;i<n;i++){
            if(st.size() >= 1 && s.charAt(i)==st.peek()){
                st.pop();
            }
            else st.push(s.charAt(i));
       }
       StringBuilder ans = new StringBuilder();
       while(!st.isEmpty()){
        ans.append(st.pop());
       }
       ans.reverse();
       return ans.toString();
    }
}