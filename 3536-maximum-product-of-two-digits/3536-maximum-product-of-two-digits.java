class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(n>0){
            int ld = n%10;
            ans.add(ld);
            n /= 10;
        }
        int a = 0;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)==0) continue;
            int res = 1;
            for(int j=0;j<ans.size();j++){
                if(ans.get(j)==0) continue;
                if(i !=j){
                    res = ans.get(i)*ans.get(j);
                    if(res>a) a = res;
                }
            }
        }
        return a;
    }
}