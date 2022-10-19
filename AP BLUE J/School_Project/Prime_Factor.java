import java.util.*;
class Prime_Factor{
    public static void main(String args[])/**main function definition*/
    {
        int n,s=0,i=2;/**variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        n=sc.nextInt();
        System.out.print("Prime factors of "+n+" :");/**displaying the message*/
        while(n>1)/**starting of while loop*/
        {
            if(n%i==0)/**starting of if-else statement*/
            {
                s+=i;
                System.out.print(i+" ");/**displaying the prime factors*/
                n=n/i;
            }
            else
                i++;
            /**end of if-else statement*/
        }/**end of while loop*/
        System.out.println("\nSum = "+s);/**displaying the sum of the prime factors*/
    }/**end of main()*/
}/**end of class Prime_Factor*/
