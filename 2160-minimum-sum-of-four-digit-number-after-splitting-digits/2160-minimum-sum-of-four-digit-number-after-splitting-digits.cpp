class Solution {
public:
    int minimumSum(int num) {
        int ones = num%10;
        num /= 10;
        int tens  = num%10;
        num /= 10;
        int huns = num%10;
        num /= 10;
        int thou = num;
        vector<int> a(4);
        a[0] = ones;
        a[1] = tens;
        a[2] = huns;
        a[3] = thou;
        sort(a.begin(),a.end());
        int num1 = a[0];
        num1 *= 10;
        num1 += a[2];
        int num2 = a[1];
        num2 *= 10;
        num2 += a[3];
        return num1+num2;

    }
};