class Solution {
public:
    void fillsieve(vector<bool>& s){
        int n = s.size();
        for(int i=2;i*i<=n;i++){
            if(s[i]){
            for(int j=i*2;j<=n;j+=i){
                s[j]=0;
            }
            }
        }
    }
    int distinctPrimeFactors(vector<int>& nums) {
        int n = nums.size();
        int maxv = -1;
        for(int i=0;i<n;i++){
            maxv = max(maxv,nums[i]);
        }
        vector<bool> sieve(maxv+1,1); // 1 means prime
        if(maxv+1>0) sieve[0] = 0;
        if(maxv+1>1) sieve[1] = 0; 
        fillsieve(sieve);
        vector<int> primes;
        for(int i=2;i<=maxv;i++){
            if(sieve[i]==1) primes.push_back(i);
        }
        vector<bool> taken(primes.size(),0);
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<primes.size();j++){
                if(primes[j]>nums[i]) break;
                if(nums[i]%primes[j]==0) taken[j] = 1;
            }
        }
    int count = 0;
    for(int i=0;i<primes.size();i++){
        if(taken[i]==1) count++;
    }
    return count;
    }
};