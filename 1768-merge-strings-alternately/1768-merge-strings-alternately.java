class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder ans = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i=0;
        int j=0;
        char ch;
        while(i<n && j<m){
            ch = word1.charAt(i);
            ans.append(ch);
            i++;
            ch = word2.charAt(j);
            ans.append(ch);
            j++;
        }
        if(i==n){
            while(j<m){
            ch = word2.charAt(j);
            ans.append(ch);
            j++;
            }
        }
        if(j==m){
            while(i<n){
            ch = word1.charAt(i);
            ans.append(ch);
            i++;
            }
        }
        return ans.toString();
    }
}