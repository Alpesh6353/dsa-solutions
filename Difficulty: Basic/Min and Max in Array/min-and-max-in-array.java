class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int minm = Integer.MAX_VALUE;
        int maxm = -1;
        for(int i=0;i<n;i++){
            if(arr[i]>maxm) maxm = arr[i];
            if(arr[i]<minm) minm = arr[i];
        }
        ans.add(minm);
        ans.add(maxm);
        return ans;
    }
}
