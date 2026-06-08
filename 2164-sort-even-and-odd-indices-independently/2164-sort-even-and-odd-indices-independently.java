class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n==1) return nums;
        int n1 = n-n/2;
        int n2 = n/2;
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        int i=0;
        int j=0;
        int k=0;
        while(n>i){
           arr1[j++] = nums[i++];
           if(k<n2 && i<n) arr2[k++] = nums[i++];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int left = 0, right = n2-1; left < right; left++, right--) {
            int temp = arr2[left];
            arr2[left] = arr2[right];
            arr2[right] = temp;
        }
        i=0;
        j=0;
        k=0;
        while(n>i){
            nums[i++] = arr1[j++];
            if(k<n2 && i<n) nums[i++] = arr2[k++];
        }
        return nums;
    }
}