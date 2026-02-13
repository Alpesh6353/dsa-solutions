class Solution {
public:
    int strStr(string haystack, string needle) {
        int m = haystack.size();
        int n = needle.size();
        int i=0;
        int j=0;
        int k=-1;
        while(i<m && j<n){
            if(haystack[i]==needle[j]){
                i++;
                j++;
            }
            else{
                i = i - j + 1;
                j=0;
            }
        }
        if(j==n) return i-n;
        else return -1;
    }
};