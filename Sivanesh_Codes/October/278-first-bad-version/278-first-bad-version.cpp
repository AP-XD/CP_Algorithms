// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int x=INT_MAX;
    int f=0;
    void solution(int n,int l,int r)
    {
        if(l>=r)
            return;
        int m=l+(r-l)/2;
        if(isBadVersion(m)==true)
        {
            x=min(x,m);
            f=1;
            solution(n,l,m);
        }
        else
        {
            solution(n,m+1,r);
        }
        
    }
    int firstBadVersion(int n) {
        solution(n,1,n);
        if(f==0)
            return n;
        return x;
    }
};