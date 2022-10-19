import java.util.*;
class Bouncy_Number
{
    String s;char ch;int f,i;/**Instance variable declaration*/
    boolean isIncreasing(int n)/**Function to check whether a number is Increasing*/
    {
        s=Integer.toString(n);/**Variable initialization*/
        for(i=0;i<s.length()-1;i++)
        {
            ch=s.charAt(i);
            if(ch>s.charAt(i+1))/** If any digit is more than next digit then we have to stop checking*/
            {
                f=-1;
                break;
            }
        }
        if(f==-1)
            return false;
        else
            return true;
    }

    boolean isDecreasing(int n)/**Function to check whether a number is Decreasing*/
    {
        s=Integer.toString(n);/**Variable initialization*/
        for(i=0;i<s.length()-1; i++)
        {
            ch=s.charAt(i);
            if(ch<s.charAt(i+1))/** If any digit is less than next digit then we have to stop checking*/
            {
                f=1;
                break;
            }
        }
        if(f==1)
            return false;
        else
            return true;
    }

    void isBouncy(int n)
    {
        if(isIncreasing(n))
            System.out.println("The number "+n+" is Increasing and Not Bouncy");/**Displaying message 1 according to condition*/
        else if(isDecreasing(n))
            System.out.println("The number "+n+" is Decreasing and Not Bouncy");/**Displaying message 2 according to condition*/
        else
            System.out.println("The number "+n+" is bouncy");/**Displaying message 3 according to condition*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        Bouncy_Number ob=new Bouncy_Number();
        System.out.print("Enter a number:");
        int n=sc.nextInt();/**Accepting number from user*/
        ob.isBouncy(n);
    }/**end of main()*/
}/**end of Bouncy_Number*/