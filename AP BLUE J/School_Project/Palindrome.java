import java.util.*;
class Palindrome
{
    static int i,s=0;/**class variable declaration and initialization*/
    void accept()/**accept() function defintion*/
    {   
        int n;
        Scanner sc =new Scanner(System.in);
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter the number");
            n=sc.nextInt();
            display(n);
        }
    }
    /**end of accept()*/
    boolean checkPalin(int n)/**checkPalin() function defintion*/
    {
        int cp=n,d,r=0;/**variable declaration and initialization*/
        while(n>0)
        {
            d=n%10;/**extraction of last digit*/
            r=r*10+d;
            n/=10;/**removing the last digit of number*/
        }
        if(cp==r)/**starting of if-else statement*/
            return true;
        else
            return false;
        /**starting of if-else statement*/ 
    }
    /**end of checkPalin()*/
    void display(int n1)/**display() function definition*/
    {
        if(checkPalin(n1)){
            s+=n1;
            System.out.println(n1+" is a palindrome number");
        }
        else
        System.out.println(n1+" is not a palindrome number");
        if(i==10)
            System.out.println("Sum="+s);
    }
    /**end of display()*/
    public static void main(String args[])/**main function definition*/
    {
        Palindrome ob =new Palindrome();/**object creation*/
        ob.accept();/**function calling through object*/
    }
}
