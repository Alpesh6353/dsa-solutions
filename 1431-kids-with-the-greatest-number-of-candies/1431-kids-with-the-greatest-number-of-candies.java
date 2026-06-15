class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> arr = new ArrayList<>();
        int max = -1;
        for(int i=0;i<n;i++) if(candies[i]>max) max = candies[i];
        for(int i=0;i<n;i++) arr.add(candies[i]+extraCandies >= max);
        return arr;
    }
}