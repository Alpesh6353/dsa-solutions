class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int pos = 0;
        int uns = 0;
        for(int i=0;i<n;i++){
            char ch = moves.charAt(i);
            if(ch=='L') pos--;
            else if(ch=='R') pos++;
            else uns++;
        }
        pos = Math.abs(pos);
        return uns+pos;
    }
}