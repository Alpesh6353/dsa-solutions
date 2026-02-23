class Solution {
public:
    bool isDigitorialPermutation(int n) {
        int original = n;
        int sum = 0;

        int fact[10] = {1,1,2,6,24,120,720,5040,40320,362880};

        // factorial digit sum
        while(n > 0){
            sum += fact[n % 10];
            n /= 10;
        }

        // convert both numbers to strings
        string a = to_string(original);
        string b = to_string(sum);

        sort(a.begin(), a.end());
        sort(b.begin(), b.end());

        return a == b;
    }
};