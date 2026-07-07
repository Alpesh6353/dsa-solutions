class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int j = 0;
        int k = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            j=i-1;
            k=i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    j--;
                    k++;
                    count++;
                }
                else break;
            }
            j=i;
            k=i+1;
            while(j>=0 && k<n){
                if(s.charAt(j)==s.charAt(k)){
                    j--;
                    k++;
                    count++;
                }
                else break;
            }
        }
        return count+n;
    }
}