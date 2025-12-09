class Solution {
public:
    vector<int> getRow(int rowIndex) {
        int m = rowIndex+1;
        vector<int> v(m);
        for(int i=0;i<=rowIndex;i++){
            long long curr = 1;
            for(int j=0;j<=i;j++){
                if(i==rowIndex){
                    v[j] = curr;
                    curr = curr*(i-j)/(j+1);                }
            }
        }
        return v;
    }
};