class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = "";
        String a = "";
        int j = 0;
        int k = 0;
        ans += s.substring(0,1);
        for(int i=0;i<n;i++){
            j = i-1;
            k = i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    ans = s.substring(j,k+1);
                    k++;
                    j--;
                }
                else break;
            }
            if(ans.length() > a.length()) a = ans;
            ans = "";
            j = i;
            k = i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    ans = s.substring(j,k+1);
                    k++;
                    j--;
                }
                else break;
            }
            if(ans.length() > a.length()) a = ans;
            ans = "";
        }
        return a;
    }
}