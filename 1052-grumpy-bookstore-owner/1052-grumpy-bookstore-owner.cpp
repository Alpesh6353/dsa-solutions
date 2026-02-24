class Solution {
public:
    int maxSatisfied(vector<int>& customers, vector<int>& grumpy, int minutes) {
        int n = customers.size();
        int m = grumpy.size();
        int k = minutes;
        int preloss = 0;
        for(int i=0;i<k;i++){
            if(grumpy[i]==1){
            preloss += customers[i];
            }
        }
        int maxloss = preloss;
        int maxidx=0;
        int i = 1;
        int j = k;
        while(j<n){
            int currloss = preloss;
            if(grumpy[j]==1) currloss += customers[j];
            if(grumpy[i-1]==1) currloss -= customers[i-1];
            if(maxloss<currloss){
                maxloss=currloss;
                maxidx = i;
            }
            preloss = currloss;
            i++;
            j++;
        }
        for(int i=maxidx;i<maxidx+k;i++){
            grumpy[i] = 0;
        }
        int maxs = 0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0) maxs += customers[i];
        }
        return maxs;
    }
};