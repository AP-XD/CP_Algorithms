class Fibonacci_Series
{
    public static void main(String args[])/**main function definition*/
    {
        int a=1,b=1,s=a+b,c=a+b,i;/**variable declaration and initialization*/
        System.out.print("The fibonacci series = "+a+","+b+",");/**displaying the first 2 terms of the fibonacci series*/ 
        while(c<200)/**starting of while loop*/
        {
            System.out.print(c+",");/**displaying rest of the terms of the fibonacci series*/        
            s=s+c;/**calculation of sum of the fibonacci series*/
            a=b;/**swapping value of a to b*/
            b=c;/**swapping value of b to c*/
            c=a+b;/**declaring the new value of the next term*/
        }
        System.out.println("\nThe sum of the fibonacci series upto  terms = "+s);/**displaying the sum of the fibonacci series*/
    }/**end of main method*/
}/**end of class Fibonacci_Series*/
