class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
        int n = arr.length;
        Vector<Integer> ans = new Vector<>();
        int i = n-1;
        int carry = 1;
        while(i>=0){
            int sum = arr[i] + carry;
            ans.add(sum%10);
            sum /= 10;
            carry = sum;
            i--;
        }
        while(carry != 0){
            ans.add(carry%10);
            carry /= 10;
        }
        i=0;
        int j=ans.size()-1;
        while(i<j){
            int temp = ans.get(i);
            ans.set(i,ans.get(j));
            ans.set(j,temp);
            i++;
            j--;
        }
        return ans;
    }
}