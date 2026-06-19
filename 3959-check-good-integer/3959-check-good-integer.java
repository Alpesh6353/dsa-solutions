class Solution {
    public boolean checkGoodInteger(int n) {
     int ds = 0;
     int ss = 0;
     int a = n;
     int ld = 0;
     while(a != 0){
         ld = a%10;
         ds += ld;
         ss += (ld*ld);
         a /= 10;
     }
     return (ss-ds>=50);
    }
}