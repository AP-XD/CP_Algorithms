 

import java.util.*;
class Comp_Fibo{
    int n;/**Instance variable declaration*/
    Comp_Fibo()/**Default Constructor*/
    {
        n=0;
    }

    boolean chk_Composite(int n)/**Starting of chk_Composite(int)*/
    {   
        int i,c=0;/**Variable description and initialization*/
        for(i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==0)/**Composite number checking*/
            return false;
        else 
            return true;
    }

    int chk_Fibo(int n)/**Starting of chk_Fibo(int)*/
    {
        int a=0,b=1;/**Variable description and initialization*/
        if(n==a || n==b)/**Fibonacci number checking*/
            return 1;
        while(a<=n)
        {
            a=a+b;
            if(a==n)/**Fibonacci number checking*/
                return 1;   
            a=a+b;
            b=a-b;
            a=a-b;
        }
        return 0;
    }

    void display(int num)/**Starting of display(int)*/
    {
        int i;/**Variable declaration and initialization*/
        System.out.println("Composite non-Fibonacci numbers are as follows:-");
        for(i=1;i<=num;i++)
        {
            if(chk_Fibo(i)==0 && chk_Composite(i)==true)/**Checking composite non-Fibonacci number*/
                System.out.print(i+"\t");/**Displaying composite non-Fibonacci number*/
        }
    }

    public static void main(String args[])/**main() declaration*/
    {
        Comp_Fibo ob=new Comp_Fibo();/**Object creation*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the upper limit");
        ob.n=sc.nextInt();/**Accepting upper limit from user*/
        ob.display(ob.n);/**Function Calling*/
    }/**end of main()*/
}/**end of Comp_Fibo*/