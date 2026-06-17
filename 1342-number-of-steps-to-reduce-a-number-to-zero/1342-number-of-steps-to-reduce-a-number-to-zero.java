class Solution {
    public int numberOfSteps(int num) {
        if(num==0) return 0;
        int count = 0;
        while(num !=0){
            if(num%2==0) count++;
            else {
                num--;
                count += 2;
            }
            num /= 2;
        }
        return --count;
    }
}