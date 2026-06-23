class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        for(int i=0;i<n;i++){
            if(target<letters[i]) return letters[i];
        }
        return letters[0];
    }
}