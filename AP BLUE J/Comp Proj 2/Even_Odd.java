class Even_Odd
{
    public static void main(int n)/**main function definition*/
    {
        int d,p=1,r=0,cp=n;/**variable declaration and initialization*/
        if(n%2==0){/**starting of if-else statement*/
            while(n>0){/**starting of while loop*/
                d=n%10;/**extraction of last digit*/
                p*=d;/**calculation of product of digits*/
                n/=10;/**removing the last digit of number*/
            }/**end of while loop*/
            System.out.println("Product of digits of the number "+cp+" is="+p);/**displaying the Product of digits of the number*/
        }
        else{
            while(n>0){/**starting of while loop*/
                d=n%10;/**extraction of last digit*/
                r=r*10+d;/**reversing the number*/
                n/=10;/**removing the last digit of number*/
            }/**end of while loop*/
            System.out.println("Reversed form of the number "+cp+" is= "+r);/**displaying the Reversed form of the number*/
        }/**end of if-else statement*/
    }/**end of main method*/
}/**end of class Even_Odd*/
