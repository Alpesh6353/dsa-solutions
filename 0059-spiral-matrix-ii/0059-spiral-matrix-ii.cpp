class Solution {
public:
    vector<vector<int>> generateMatrix(int n) {
       vector<vector<int>> y(n,vector<int>(n));
       int num = 1;
       int minr=0,minc=0;
       int maxr=n-1,maxc=n-1;
       while(minr<=maxr && minc<=maxc){
        for(int j=minc;j<=maxc;j++){
            y[minr][j] = num++;
        }
        minr++;
        if(minr>maxr || minc>maxc) break;
        for(int i=minr;i<=maxr;i++){
            y[i][maxc] = num++;
        }
        maxc--;
        if(minr>maxr || minc>maxc) break;
        for(int j=maxc;j>=minc;j--){
            y[maxr][j] = num++;
        }
       maxr--;
       if(minr>maxr || minc>maxc) break;
       for(int i=maxr;i>=minr;i--){
        y[i][minc] = num++;
       }
       minc++;
       if(minr>maxr || minc>maxc) break;
    }
    return y;
    }
};