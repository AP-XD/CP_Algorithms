import java.util.*;
class Fibo_Recursion
{
    int fibonacci(int n)/**starting of fibonacci(int)*/
    {
        if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2); /**trail recursion*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        Fibo_Recursion ob=new Fibo_Recursion();
        System.out.println("Enter number upto which Fibonacci series to display:");
        int n=sc.nextInt(),i;/**Variable declaration and initialization*/
        System.out.println("Fibonacci series upto "+n);        
        for(i=1;ob.fibonacci(i)<=n; i++)
        {
            System.out.print(ob.fibonacci(i) +" ");/**displaying Fibonacci series upto number*/
        }
    }/**end of main()*/
}/**end of Fibo_Recursion*/