import java.util.*;
class Smith_No
{
    int sumDig(int n)/**function for finding sum of digits*/
    {
        int s=0;/**Variable declaration and initialization*/
        while(n>0)
        {
            s=s+n%10;
            n=n/10;
        }
        return s;
    }

    int sumPrimeFact(int n)/**function for generating prime factors and finding their sum*/
    {
        int i=2,sum=0;/**Variable declaration and initialization*/
        while(n>1)
        {
            if(n%i==0)
            {
                sum=sum+sumDig(i); /**Here 'i' is the prime factor of 'n' and we are finding its sum*/
                n=n/i;
            }
            else
                i++;
        }
        return sum;
    }

    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        Smith_No ob=new Smith_No();
        int l,u,i,j,a,b,t=0;
        do
        {
            System.out.println("Enter lower limit");
            l=sc.nextInt();
            System.out.println("Enter upper limit");
            u=sc.nextInt();
        }while(l>=u);
        for(i=l;i<=u;i++)
        {
            t=0;
            for(j=2;j<Math.sqrt(i);j++)
            {
                if(i%j==0)
                    t++;
            }
            if(t>0)
            {
                a=ob.sumDig(i);/** finding sum of digit*/
                b=ob.sumPrimeFact(i); /**finding sum of prime factors*/
                if(a==b)
                    System.out.print(i+"  ");
            }
        }
    }/**end of main()*/
}/**end of Smith_No*/