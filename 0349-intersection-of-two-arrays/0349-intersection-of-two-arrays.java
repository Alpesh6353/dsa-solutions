class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int[] arr1 = new int[1001];
       int[] arr2 = new int[1001];
       for(int i=0;i<n;i++){
        arr1[nums1[i]]++;
       }
       for(int i=0;i<m;i++){
        arr2[nums2[i]]++;
       }
       ArrayList<Integer> ans = new ArrayList<>();
       int j=0;
       while(j<1001){
        if(arr1[j] != 0 & arr2[j] != 0) ans.add(j);
        j++;
       }
       int[] res = new int[ans.size()];
       for(int i=0;i<ans.size();i++){
        res[i] = ans.get(i);
       }
       return res;
    }
}