import java.util.*;
class Keith_No
{
    public static void main(String[] args)/**main() declaration*/
    { 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Input a number: "); 
        int n=sc.nextInt();String s=Integer.toString(n);int d=s.length(),arr[]=new int[n],i,j,sum,n1=n;/**Variable declaration and initialization*/
        for(i=d-1;i>=0;i--)
        {
            arr[i]=n1%10;
            n1=n1/10;
        }
        i=d;sum=0;/**Variable initialization*/
        while(sum<n)
        {
            sum=0;
            for(j=1;j<=d;j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
        if(sum==n)
            System.out.println("The Number "+n+" is a Keith Number");/**message 1*/
        else
            System.out.println("The Number "+n+" is Not a Keith Number");/**message 2*/
    }/**end of main()*/
}/**end of Keith_No*/