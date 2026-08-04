class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int k = nums[0];
        int i=0;
        while(i<n){
            if(nums[i]==k){
                i++;
                k++;
            }
            else {
                ans.add(k);
                k++;
            }
        }
        return ans;
    }
}