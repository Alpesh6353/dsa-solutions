class Solution {
    public int countEven(int num) {
        int count = 0;
        int a = 0;
        int sum = 0;
        int ld = 0;
        for(int i=1;i<=num;i++){
            a = i;
            if(a<10 && a%2==0) count++;
            else {
                sum = 0;
                while(a>0){
                    ld = a%10;
                    sum += ld;
                    a /= 10;
                }
                if(sum%2==0) count++;
            }
        }
        return count;
    }
}