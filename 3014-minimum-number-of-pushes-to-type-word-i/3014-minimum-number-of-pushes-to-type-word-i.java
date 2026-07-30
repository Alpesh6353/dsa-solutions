class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n<=8) return n;
        else {
            int a = n/8;
            if(a==1){
                if(n%8==0) return  8;
                return 8+(n%8)*2;
                }
            else if(a==2){
                if(n%8==0) return  24;
                return 24+(n%8)*3;
                }
            else if(a==3){
                if(n%8==0) return 48 ;
                return 48+(n%8)*4;
                }
        }
        return 0;
    }
}