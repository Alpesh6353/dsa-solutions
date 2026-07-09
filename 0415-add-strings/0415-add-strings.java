class Solution {
    public String addStrings(String num1, String num2) {
        int n = num1.length();
        int m = num2.length();
        StringBuilder ans = new StringBuilder();
        int i=n-1;
        int j=m-1;
        char ch1;
        int x = 0;
        while(i>=0 && j>=0){
            ch1 = num1.charAt(i);
            x += ch1 - '0';
            ch1 = num2.charAt(j);
            x += ch1 - '0';
            i--;
            j--;
            ans.append(x%10);
            x /= 10;
        }
        if(i==-1){
            while(j>=0){
            ch1 = num2.charAt(j);
            x += ch1 - '0';
            ans.append(x%10);
            x /= 10;
            j--;
            }
        }
        if(j==-1){
            while(i>=0){
            ch1 = num1.charAt(i);
            x += ch1 - '0';
            ans.append(x%10);
            x /= 10;
            i--;
            }
        }
        if(x > 0)  ans.append(x%10);
        ans.reverse();
        return ans.toString();
    }
}