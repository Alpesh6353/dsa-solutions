class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        int i=0;
        int j=0;
        int k = 1;
        while(n>i){
            if(nums[i]%2==0){
                arr[j] = nums[i];
                j+=2;
            }
            else{
                arr[k] = nums[i];
                k += 2;
            }
            i++;
        }
        return arr;
    }
}