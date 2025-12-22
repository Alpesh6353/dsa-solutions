class Solution {
public:
bool isps(int x){
    int root = sqrt(x);
    if(root*root==x) return true;
    else return false;
}
    bool judgeSquareSum(int c) {
        int a = 0;
        int b = c;
        while(a<=b){
        if(isps(a) && isps(b)) return true;
            else if(!isps(b)){
                b = (int)sqrt(b)*(int)sqrt(b);
                a = c-b;
            }
            else { // x ic not perfect;
                a=(int)(sqrt(a)+1)*(int)(sqrt(a)+1);;
                b = c-a;
            }
        }
            return false;
    }
};