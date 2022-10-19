class ATTACH
{
    static void makenum(int n)
    {
        System.out.println("N2="+n+sum(n));
    }

    static int sum(int n)
    {
        int s=0;
        while(n>0)
        {
            s+=n%10;
            n/=10;
        }
        return s;
    }
}