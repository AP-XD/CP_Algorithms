package Others;

class test1{
    int pfibo;
    static int checkfibo(int n){
        int a=0,b=1,c=0,k=0;
        if(n==a || n==b)
            return 1;

        while(a<n){
            a=a+b;

            if(n==a)
                return 1;
            a=a+b;
            b=a-b;
            a=a-b;}

        return 0;
    }

    static void fibo(int n){
        for(int i=1;i<=n;i++)
        {
            if(checkfibo(i)==1)
                System.out.print(i+"  ");
        }}

    public static void main(double x)
    {
        String s="Stack FolloWS LIFO LogiC";
        System.out.println((s.indexOf('g')));
        System.out.println(Math.rint(x));
    }
}