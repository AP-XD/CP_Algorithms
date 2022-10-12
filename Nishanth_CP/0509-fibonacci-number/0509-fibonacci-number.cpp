class Solution {
public:
    int fib(int n) {
        int a =1,b=1;
        int c;
        if(n==0) return 0;
        else if(n<=2) return 1;
        else {
            for(int i=0;i<n-2;i++){
                c=a+b;
                int t = b;
                b=c;
                a=t;
            }
        }
        return c;
    }
};