class Solution {
public:
    bool checkIfPangram(string sentence) {
        int n = sentence.size();
        if(n<26) return false;
        sort(sentence.begin(),sentence.end());
        string ans = "abcdefghijklmnopqrstuvwxyz";
        int i=0;
        int j = 0;
        while(i<n && j<26){
            if(sentence[i]<ans[j]){
                i++;
            }
            else if(sentence[i]==ans[j]){
                i++;
                j++;
            }
            else i++;
        }
        return j==26;
    }
};