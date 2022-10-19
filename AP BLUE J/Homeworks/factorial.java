import java.util.*;
class factorial
{
    void fac()
    {
    Scanner sc=new Scanner(System.in);
    int n;
    do
    {
        System.out.println("enter a number");
        n=sc.nextInt();
    }while(n<=0);
    int f=1;
    for(int i=1;i<=n;i++)
    {
        f=f*i;
        
    }
    System.out.println("factorial:"+f);
    }

    public static void main(String args[]) 
    {
    factorial ob=new factorial();
     ob.fac();
  }
}