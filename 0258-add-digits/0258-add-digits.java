class Solution {
    public int addDigits(int num) {
        int sum = -11;
        while(sum/10 != 0){
            sum=0;
            while(num > 0){
                int ld = num%10;
                sum += ld;
                num /= 10;
            }
            num = sum;
        }
        return sum;
    }
}