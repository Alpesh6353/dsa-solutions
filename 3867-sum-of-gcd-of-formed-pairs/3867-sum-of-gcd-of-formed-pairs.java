class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int maxm = nums[0];
        for(int i=0;i<n;i++){
            int a = nums[i];
            maxm = Math.max(maxm,nums[i]);
            int b = maxm;
            while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
           }
           arr[i] = a;
        }
        Arrays.sort(arr);
        long sum = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            int a = arr[i];
            int b = arr[j];
            while(b>0){
            int temp = b;
            b = a%b;
            a = temp;
           }
           sum += a;
           i++;
           j--;
        }
        return sum;
    }
}