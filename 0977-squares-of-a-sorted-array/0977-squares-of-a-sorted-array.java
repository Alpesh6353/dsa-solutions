class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int k = -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]<0) k=i;
            nums[i] = nums[i]*nums[i];
        }
        if(k==-1) return nums;
        if(k==n-1){
            for(int i=0;i<n;i++){
                arr[i] = nums[n-1-i];
            }
            return arr;
        }
        int j = k+1;
        int i = 0;
        while(k>=0 && j<n){
            if(nums[k]>nums[j]){
                arr[i] = nums[j];
                i++;
                j++;
            }
            else {
                arr[i] = nums[k];
                i++;
                k--;
            }
        }
        while(k>=0) arr[i++] = nums[k--];
        while(j<n) arr[i++] = nums[j++];
        return arr;
    }
}