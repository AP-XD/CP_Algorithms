 

class Base_Convert
{
    int gen()/**Starting of gen()*/
    {
        int n=(int)(Math.random()*(200-100)+100);/**Finding a random number between 100-200*/
        return n;
    }

    void Base_con()/**Starting of Base_con()*/
    {
        int n=gen(),cp=n,c1=0,c2=0,d=0,j=0,s=1;String s1="";/**Variable description and initialization*/
        while(cp>0)
        {
            d=cp%8;
            c1=s*d+c1;/**Forming corresponding octal number*/
            s*=10;/**Calculating power of 10*/
            cp/=8;
        }
        s=1;
        cp=n;
        while(cp>0)
        {
            d=cp%2;
            c2=s*d+c2;/**Forming corresponding binary number*/
            s*=10;/**Calculating power of 10*/
            cp/=2;
        }
        cp=n;
        while(cp>0)
        {
            d=cp%16;
            if(d>=10)
                s1=(char)(55+d)+s1;/**Forming corresponding hexadecimal number*/
            else
                s1=d+s1;/**Forming corresponding hexadecimal number*/
            cp/=16;
        }
        System.out.println("Generated number="+n+"\nEquivalent Binary number="+c2+"\nEquivalent Octal number="+c1+"\nEquivalent Hexadecimal number="+s1);
    }

    public static void main(String args[])/**main() declaration*/
    {
        Base_Convert ob=new Base_Convert();/**Object creation*/
        ob.Base_con();/**Function Calling*/
    }/**end of main()*/
}/**end of Base_Convert*/