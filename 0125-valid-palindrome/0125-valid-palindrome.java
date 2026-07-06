class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if((ch >= 'A' && ch <='Z')){
                ch = (char)(ch + 32);
            }
            if((ch2 >= 'A' && ch2 <='Z')){
                ch2 = (char)(ch2 + 32);
            }
            if(((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) && ((ch2 >= 'a' && ch2 <= 'z') || ((ch2 >= '0' && ch2 <= '9')))){
                if(ch==ch2){
                    i++;
                    j--;
                }
                else return false;
            }
            else {
                if((ch >= 'a' && ch<= 'z' ) || (ch>='0' && ch<='9')) j--;
                else i++;
            }
        }
        return true;
    }
}