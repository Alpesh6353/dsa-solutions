class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int left = 0;
        int up=0;
        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch=='U') up++;
            else if(ch=='D') up--;
            else if(ch=='L') left++;
            else left--;
        }
        if(up==0 && left==0) return true;
        else return false;
    }
}