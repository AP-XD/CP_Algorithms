import java.util.*;
class prime
{
    void isPrime()
    {
    Scanner sc=new Scanner(System.in);
    int n, i,  k=0;
    do
    {
        System.out.println("Enter the number");
        n=sc.nextInt();
    }while(n<=0);
    for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
            }
        }
        if(k==0)
        {

            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("the number is not prime");
        }
        }
    

    
    public static void main(String args[]) 
    {
     prime ob=new prime();
     ob.isPrime();
  }
}