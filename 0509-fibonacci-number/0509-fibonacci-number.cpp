class Solution {
public:
    int fib(int n) {
    int next=0;
    int a=0,b=1;
    for(int i=1;i<=n;i++){
        next = a+b;
        a=b;
        b=next;
    }
    return a;
    }
};