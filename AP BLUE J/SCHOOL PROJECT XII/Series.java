 

import java.util.*;
class Series
{
    static int n,x;/**Instance variable declaration*/
    public void input()/**Starting of input()*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms");
        n=sc.nextInt();/**Accepting number of terms from user*/
        System.out.println("Enter value of x");
        x=sc.nextInt();/**Accepting value of x from user*/
    }

    public void sum_Of_Series()/**Starting of sum_Of_Series()*/
    {   
        double s=1.0;
        int i,k=-1;/**Variable declaration and initialization*/
        for(i=1;i<n;i++)
        {
            s+=k*(calculate(x,(i*2))/calculate(i*2));/**Calculating sum of series*/
            k*=-1;/**Calculating power of -1*/
        }
        display(s);
    }

    public double calculate(int x1,int n1)/**Starting of calculate(int,int)*/
    {
        int i;
        double p=1.0;/**Variable declaration and initialization*/
        for(i=1;i<=n1;i++)
        {
            p*=x1;/**Calculating x1 to the power of n1*/
        }
        return p;
    }

    public int calculate(int n1)/**Starting of calculate(int)*/
    {
        int i,f=1;/**Variable declaration and initialization*/
        for(i=1;i<=n1;i++)
        {
            f*=i;/**Calculating factorial of n1*/
        }
        return f;
    }

    public void display(double s1)/**Starting of display(double)*/
    {
        System.out.print("Sum of Series with number of terms="+n+" and value of x="+x+" is:"+s1);
    }
}/**end of Series*/  