class Solution {
    public String reformatDate(String date) {
        StringBuilder ans = new StringBuilder();
        String[] words = date.split(" ");
        String[] arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        ans.append(words[2]);
        ans.append("-");
        int idx = Arrays.asList(arr).indexOf(words[1])+1;
        if(idx<10){
             ans.append(0);
             ans.append(idx);
             }
        else ans.append(idx);
        ans.append("-");
        String a = words[0];
        String b;
        if(a.charAt(0)>='0' && a.charAt(1)<='9' && a.charAt(1)>='0' && a.charAt(1)<='9')  b = a.substring(0,2);
        else {
            ans.append(0);
            b = a.substring(0,1);
        }
        ans.append(b);
        return ans.toString();
    }
}