class Kaprekar
{
    boolean chkKap(int n)
    {
        int n1=n*n,c=(int)Math.log10(n1)+1,s=0;/**Variable declaration and initialization*/
        if((c-(c/2))>(c/2))
            s=n1/(int)(Math.pow(10,c-c/2))+(n1%(int)Math.pow(10,(c-c/2)));
        else
            s=(n1/(int)(Math.pow(10,c/2)))+(n1%(int)Math.pow(10,(c-c/2)));
        /**checking whether it is a KAPREKAR NUMBER or not*/
        if(s==n)
            return true;
        else
            return false;
    }

    public static void main(String args[])/**main() declaration*/
    {
        Kaprekar ob=new Kaprekar();
        int s=0,i;/**Variable declaration and initialization*/
        System.out.print("THE KAPREKAR NUMBERS ARE:");
        for(i=1;i<=1000;i++)
        {
            if(ob.chkKap(i)==true)
            {
                System.out.print(i+"  ");/**Displaying the KAPREKAR NUMBERS*/
                s+=i;/**Calculating the SUM OF KAPREKAR NUMBERS*/
            }
        }
        System.out.print("\n"+"SUM OF KAPREKAR NUMBERS IS:"+s);/**Displaying the SUM OF KAPREKAR NUMBERS*/
    }/**end of main()*/
}/**end of Kaprekar*/