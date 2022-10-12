class Solution {
public:
    double myPow(double x, int n) {
        long double ans=1.0;
        long int n1=abs(n);
        while(n1)
        {
            if(n1%2==0)
            {
                x=x*x;
                n1=n1/2;
            }
            else
            {
                ans=ans*x;
                n1--;
            }
        }
        if(n<0)
            ans=(double) 1.0/ans;
        return ans;
    }
};