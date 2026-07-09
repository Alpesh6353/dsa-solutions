class Solution {
    public String toGoatLatin(String sentence) {
        int n = sentence.length();
        StringBuilder ans = new StringBuilder();
        int i=0;
        int count = 1;
        boolean flag = false;
        int k = -1;
        while(i<n){
            while(i<n && sentence.charAt(i)==' ') i++;
            if(i==n) break;
            char ch = sentence.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                flag = true;
            }
            if(flag==false) k = i;
            while(i<n && sentence.charAt(i) != ' '){
                if(flag==true){
                    ch = sentence.charAt(i);
                    ans.append(ch);
                    i++;
                }
                else{
                    if(i<n-1 && sentence.charAt(i+1)!=' '){
                        ch = sentence.charAt(i+1);
                        ans.append(ch);
                        i++;
                    }
                    else i++;
                }
            }
            if(flag==true){
                ans.append("ma");
                ans.append("a".repeat(count));
            }
            else{
                ch = sentence.charAt(k);
                ans.append(ch);
                ans.append("ma");
                ans.append("a".repeat(count));
            }
            if(i<n-1) ans.append(" ");
            count++;
            flag = false;
        }
        return ans.toString();
    }
}