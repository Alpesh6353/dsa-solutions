class Solution {
public:
    vector<int> addToArrayForm(vector<int>& num, int k) {
        int n = num.size();
        vector<int> v;
        int carry = k%10;
        int i = n-1;
        while(i>=0){
            carry += num[i];
            v.push_back(carry%10);
            carry /= 10;
            i--;
            k /= 10;
            carry = carry + k%10;
        }
        while(carry){
            v.push_back(carry%10);
            carry /= 10;
            k /= 10;
            carry = carry + k%10;
            }
        while(k!=0){
            v.push_back(k%10);
            k /= 10;
        }
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
