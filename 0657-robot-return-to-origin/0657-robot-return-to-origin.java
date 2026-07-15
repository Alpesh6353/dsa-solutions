class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int left = 0;
        int right = 0;
        int up=0;
        int down=0;
        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch=='U') up++;
            else if(ch=='D') down++;
            else if(ch=='L') left++;
            else right++;
        }
        if(up==down && left==right) return true;
        else return false;
    }
}