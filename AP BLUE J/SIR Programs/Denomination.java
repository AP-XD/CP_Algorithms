import java.util.*;
class Denomination
{
    Scanner sc=new Scanner(System.in);
    private int n;
    private int arr[]={100,50,20,10,5,2};
    public void get()
    {
        System.out.println("Enter amount");
        n=sc.nextInt();
    }
    public void deno()
    {
        int r=0,b=n;
        System.out.println("Total amount = Rs."+n);
        for(int i=0;i<6;i++)
        {
            r=b/arr[i];
            System.out.println("Number of Rs."+arr[i]+" note(s) is/are = "+r);
            b%=arr[i];
        }
        System.out.println("Number of Re.1 note(s) is/are = "+b);
    }
    public static void main(String args[])
    {
        Denomination ob=new Denomination();
        ob.get();
        ob.deno();
    }
}
        
            