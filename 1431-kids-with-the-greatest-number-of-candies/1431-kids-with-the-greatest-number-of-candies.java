class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max = -1;
        for(int i=0;i<n;i++){
            if(candies[i]>max) max = candies[i];
        }
        for(int i=0;i<n;i++){
            int c = extraCandies+candies[i];
            if(c>=max) arr.add(true);
            else arr.add(false);
        }
        return arr;
    }
}