class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n==1) return 1;
        String ans = "";
        int count = 1;
        for(int i=1;i<n;i++){
            if(chars[i]==chars[i-1]) count++;
            else{
                ans += chars[i-1];
                if(count>1) ans += count;
                count = 1;
            }
        }
        if(count>1){
            ans += chars[n-1];
            ans += count;
        }
        else{
            ans += chars[n-1];
        }
        for(int i=0;i<ans.length();i++){
            char ch = ans.charAt(i);
            chars[i] = ch;
        }
        return ans.length();
    }
}