class Solution {
public:
string cas(int n){
    if(n==1) return "1";
    string str = cas(n-1);
    string a = ""; 
    for(int i=0;i<str.length();i++){
        int count  = 1;
        while (i + 1 < str.length() && str[i] == str[i + 1]) {
                count++;
                i++;
            }
            a += to_string(count) + str[i];

    }
    return a;
    
}
    string countAndSay(int n) {
        string s = cas(n);
        return s;
    }
};