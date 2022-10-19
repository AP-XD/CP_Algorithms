import java.util.*;
class Goldbach
{
    public static void main(String args[])/**main() declaration*/
    {
        int n = 0,p = 3,q = 0;/**Variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        System.out.print("N = ");
        n=sc.nextInt();/**Accepting number from user*/
        if(n % 2 != 0){
            System.out.print("INVALID INPUT.NUMBER IS ODD.");/**Displaying the message*/
            return;
        }
        else if(n < 10 || n > 49){
            System.out.print("INVALID INPUT.NUMBER IS OUT OF RANGE.");/**Displaying the message*/
            return;
        }
        System.out.print("PRIME PAIRS ARE:");/**Displaying the message*/
        while(p < n)
        {
            q = n - p;
            if(isPrime(p) && isPrime(q) && p <= q)
                System.out.print(p + ", " + q+"\t\t");/**Displaying the prime pairs*/
            p += 2;
        }
        /**end of main()*/  
    }

    public static boolean isPrime(int n)
    {
        int f = 0,i;
        for(i = 1; i <= n; i++)
            if(n % i == 0)
                f++;
        if(f == 2)
            return true;
        return false;
    }
}/**end of class Goldbach*/