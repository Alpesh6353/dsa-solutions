class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        String ans = "";
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            ans += ch;
            arr[indices[i]] = ans;
            ans = "";
        }
        for(int i=0;i<n;i++){
            ans += arr[i];
        }
        return ans;
    }
}