class Solution {
public:
int prime(int n){
    if(n==1) return 0;
    for(int i=2;i<=sqrt(n);i++){
        if(n%i==0) return 0;
    }
    return n;
}
    int diagonalPrime(vector<vector<int>>& nums) {
        int n = nums.size();
        int m = nums[0].size();
        int maxpr = 0;
        for(int i=0;i<n;i++){
            int maxd = 0;
            for(int j=0;j<m;j++){
                if(i==j || i+j==n-1 ){
                    maxd = prime(nums[i][j]);
                    maxpr = max(maxd,maxpr);
                }
            }
        }
        return maxpr;
    }
};