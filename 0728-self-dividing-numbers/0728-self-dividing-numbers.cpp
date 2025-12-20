class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
       vector<int> v;
       for(int i=left;i<=right;i++){
        bool flag=true;
        int a = i;
           while(a>0){
            int ld = a%10;
            if(ld==0){
                flag=false;
                break;
            }
            if(i%ld==0){
                a /= 10;
                continue ;
            }
            else {
                flag = false;
                break;
            }
           }
           if(flag==true){
            v.push_back(i);
           }
       } 
       return v;
    }
};