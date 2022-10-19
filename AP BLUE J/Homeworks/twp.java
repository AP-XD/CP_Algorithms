import java.util.*;
class twp
{
    void twisted()
    {
    Scanner sc=new Scanner(System.in);
    int n, r, m, i, j, g; int s=0; int k=0, c=0;
    do
    {
        System.out.println("Enter the number");
        n=sc.nextInt();
    }while(n<=9);
         m=n;
        int p=m;
        while(m!=0)
        {
        r=m%10;
        s=(s*10)+r;
        m=m/10;}
        
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                k++;
            }
        }
        for(j=2;j<s;j++)
        {
            if(s%j==0)
            {
                c++;
            }
        }
        if(k==0&c==0)
        {

            System.out.println("the number is twisted prime");
        }
        else
        {
            System.out.println("the number is not twisted prime");
        }
    }
    

    
    public static void main(String args[]) 
    {
     twp ob=new twp();
     ob.twisted();
  }
}