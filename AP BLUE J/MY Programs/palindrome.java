class palindrome{
    int opposite(int n){
        int r=0,d;
        while(n>0){
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
    boolean ispalindrome(int n){
    if(n==opposite(n))
    return true;
    else
    return false;
    }
    void allpalindrome(int n){
        for(int i=10;i<=n;i++){
            if(ispalindrome(i))
             System.out.println(i+" ");
            }}}