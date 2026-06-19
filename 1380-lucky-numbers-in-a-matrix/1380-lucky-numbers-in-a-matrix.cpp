class Solution {
public:
    void maxmin(vector<vector<int>>& matrix,vector<int>& v,int r, int c,int m,int n){
        int min = INT_MAX;
        int max = -1;
        int k=-1;
        int l=-1;
        int a = -1;
        int b = -1;
        for(int i=0;i<n;i++){
            if(matrix[r][i]<min){
                min = matrix[r][i];
                k=r;
                l=i;
            }
        }
        for(int i=0;i<m;i++){
            if(matrix[i][c]>max){
                max = matrix[i][c];
                a=i;
                b=c;
            }
        }
        if(max==min && (k==a && l==b)) v.push_back(max);
    }
    vector<int> luckyNumbers(vector<vector<int>>& matrix) {
        int m = matrix.size();
        int n = matrix[0].size();
        vector<int> v;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                maxmin(matrix,v,i,j,m,n);
              }
        }
        return v;
    }
};