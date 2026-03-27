class Solution {
public:
    int firstUniqChar(string s) {
        int n = s.length();
        vector<bool> v(n,false);
        for(int i=0;i<n;i++){
            if(v[i]==true) continue;
            int count = 0;
            for(int j=i;j<n;j++){
                if(i != j && s[i]==s[j]){
                    v[j]=true;
                    count++;
                }
            }
            if(count==0) return i;
        }
        return -1;
    }
};