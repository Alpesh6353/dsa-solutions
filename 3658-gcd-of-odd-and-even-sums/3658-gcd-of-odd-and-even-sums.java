class Solution {
    public int gcdOfOddEvenSums(int n) {
        int evensum = 0;
        int oddsum = 0;
        int i = 1;
        while(i<=(n*2)){
            oddsum += i;
            i++;
            evensum += i;
            i++;
        }
        int tem = 1;
        while(oddsum > 0){
            tem = oddsum;
            oddsum = evensum%oddsum;
            evensum = tem;
        }
        return tem;
    }
}