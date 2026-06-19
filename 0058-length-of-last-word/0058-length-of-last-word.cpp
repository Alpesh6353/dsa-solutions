class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.length();
        int j=n-1;
        int count=0;
        while(s[j]==' ') j--;
        while( j>=0 &&  s[j] != ' '){
            j--;
            count++;
        } 
        return count;
    }
};