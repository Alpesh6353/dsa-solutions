class Solution {
  public:
    int countWords(string &s) {
        // code here
        int n = s.length();
        int i=0;
        int count = 0;
        while(i<n){
            while(i<n && (s[i] == ' ' || s[i] == '\n'  || s[i] == '\t')) i++;
            if(i>=n) break;
            while( i<n && (s[i] != ' ' && s[i] != '\n' && s[i] != '\t')) i++;
            count += 1;
        }
        return count;
    }
};