class Solution {
    public String interpret(String command) {
        int n = command.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = command.charAt(i);
            if(ch=='G') ans.append("G");
            else{
                char ch1 = command.charAt(i+1);
                if(ch1==')'){
                    ans.append('o');
                    i++;
                    }
                else {
                ans.append('a');
                ans.append('l');
                i += 3;
            }
            }
        }
        return ans.toString();
    }
}