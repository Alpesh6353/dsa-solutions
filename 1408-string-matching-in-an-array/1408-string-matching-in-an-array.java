class Solution {
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            String a = words[i];
            for(int j=0;j<n;j++){
                if(i != j && a.contains(words[j])){
                    if(!(ans.contains(words[j]))) ans.add(words[j]);
                }
            }
        }
        return ans;
    }
}