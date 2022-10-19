import java.util.*;
class tp
{
    void twin()
    {
    Scanner sc=new Scanner(System.in);
    int c=0,n,n2;
    do
    {
        System.out.println("Enter the first number");
        n=sc.nextInt();
    }while(n<=0);
     do
    {
        System.out.println("Enter the second number");
        n2=sc.nextInt();
    }while(n2<=0);
        for(int i=2;i<=n;i++)
    {
        if(n%i==0 && n2%i==0)
        c++;
    }
    if (c==1)
        System.out.println("The numbers are twin prime");
        else
        System.out.println("The numbers are not twin prime");

   
    }

    public static void main(String args[]) 
    {
     tp ob=new tp();
     ob.twin();
  }
}