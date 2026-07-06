class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        if(n<26) return false;
        int[] arr = new int[26];
        for(int i=0;i<n;i++){
            char c = sentence.charAt(i);
            int x = c - 'a';
            arr[x]++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]==0) return false;
        }
        return true;
    }
}