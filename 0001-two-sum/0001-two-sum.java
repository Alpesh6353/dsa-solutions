class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = i;
            arr[i][1] = nums[i];
        }
        Arrays.sort(nums);
        int i=0,j=n-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                ans[0] = nums[i];
                ans[1] = nums[j];
                break;
            }
            else if(nums[i]+nums[j]>target) j--;
            else i++;
        }
        int  a=-1,b=-1;
        for(int k=0;k<n;k++){
            if(a ==-1 && arr[k][1]==ans[0]){
                a = arr[k][0];
                continue;
            }
            if(b==-1 && arr[k][1]==ans[1]) b = arr[k][0];
            if(a!=-1 && b!=-1) break;
        }
        ans[0] = a;
        ans[1] = b;
        return ans;
    }
}