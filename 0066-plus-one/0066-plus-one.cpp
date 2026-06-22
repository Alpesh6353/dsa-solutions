class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int n = digits.size();
        vector<int> v;
        int carry = 1;
        int i = n-1;
        while(i>=0){
                carry += digits[i];
                v.push_back(carry%10);
                carry /= 10;
                i--;
        }
        if(carry) v.push_back(carry%10);
        i=0;
        int j = v.size()-1;
        while(i<j){
            swap(v[i],v[j]);
            i++;
            j--;
        }
        return v;
    }
};