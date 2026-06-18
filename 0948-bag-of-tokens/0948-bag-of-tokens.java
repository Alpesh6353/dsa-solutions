class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int count = 0;
        int i=0;
        int k=n-1;
        int j=0;
        while(n>j){
            if(tokens[i]<=power){
                count++;
                power -= tokens[i];
                i++;
            }
            else if(i==k) break;
            else if(count>=1){
                power += tokens[k];
                k--;
                count--;
            }
            j++;
        }
        return count;
    }
}