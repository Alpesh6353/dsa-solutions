class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        Arrays.sort(candyType);
        int type = 1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                type++;
            }
        }
        if(type==n/2) return type;
        else return Math.min(type,n/2);
    }
}