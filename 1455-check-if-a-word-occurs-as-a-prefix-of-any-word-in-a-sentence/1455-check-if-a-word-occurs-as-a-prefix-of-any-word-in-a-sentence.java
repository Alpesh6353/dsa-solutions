class Solution {
    public int isPrefixOfWord(String str, String target) {

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(target)) {
                return i + 1;   // 1-based index
            }
        }
        return -1;
    }
}