class Solution {
public:
    int maxNumberOfBalloons(string text) {
        int n = text.length();
        vector<int> v(5);
        for(int i=0;i<n;i++){
            if(text[i]=='b') v[0]++;
            else if(text[i]=='a') v[1]++;
            else if(text[i]=='l') v[2]++;
            else if(text[i]=='o') v[3]++;
            else if(text[i]=='n') v[4]++;
        }
        v[2] = v[2]/2;
        v[3] = v[3]/2;
        int min = INT_MAX;
        for(int i=0;i<5;i++){
            if(v[i]<min) min= v[i];
        }
        return min;
    }
};