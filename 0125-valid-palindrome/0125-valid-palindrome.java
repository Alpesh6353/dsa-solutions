class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= 'A' && ch <='Z'){
                ch = (char)(ch + 32);
                ans += ch;
            }
            else if(ch >= 'a' && ch <='z'){
                ans += ch;
            }
            else if(ch >= '0' && ch <= '9'){
                ans += ch;
            }
        }
        int i=0;
        int c = ans.length();
        int j = c-1;
        while(i<j){
            if(ans.charAt(i)==ans.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}