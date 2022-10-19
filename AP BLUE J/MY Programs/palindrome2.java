class palindrome2{
    int reverse(int n){
        int r=0,d;
        while(n>0){
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
    boolean ispalindrome(int n){
    if(n==reverse(n))
    return true;
    else
    return false;
    }}