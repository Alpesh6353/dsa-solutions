class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int a : nums){
            if(a>max1){
                max3 = max2;
                max2 = max1;
                max1 = a;
            }
            else if(a>max2){
                max3 = max2;
                max2 = a;
            }
            else if(a>max3){
                max3 = a;
            }
            if(a<min1){
                min2 = min1;
                min1 = a; 
            }
            else if(a<min2){
                min2 = a;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max1);
    }
}