class Solution {
    public String truncateSentence(String s, int k) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch==' ') count++;
            if(count==k) break;
            ans.append(ch);
        }
        return ans.toString();
    }
}