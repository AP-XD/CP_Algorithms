class Fibonacci_rev{
    public static void main(int n){
        int a=0,b=1,c=0;
        while(c<=n){
            c=a+b;
        System.out.println(c);
        if(n==c)
        System.out.println("rev Fibonacci");
        a=b;
        b=rev(c);}
    }
    static int rev(int n)  { 
        int d,r=0;
        while(n>0){
          d=n%10;
          r=r*10+d;
          n/=10;
        }return r;}}