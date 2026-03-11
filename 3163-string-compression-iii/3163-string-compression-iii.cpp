class Solution {
public:
    string compressedString(string word) {
        int n = word.length();
        string s = "";
        int i=0;
        while(i<n){
            int count = 1;
            char ch = word[i];
            while(i<n-1 && word[i]==word[i+1]){
                count++;
                i++;
            }
            while(count>9){
                s += (to_string(9) + ch);
                count -= 9;
            }
            s += (to_string(count) + ch);
            i++;
        }
        return s;
    }
};