import java.util.*;
class Sum
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        int r1=0,r2=0,i1=0,i2=0;/**Variable declaration and initialization*/
        /**Accepting input from User*/
        System.out.println("Enter the Real part of 1st Complex number");
        r1=sc.nextInt();
        System.out.println("Enter the Imaginary part of 1st Complex number");
        i1=sc.nextInt();
        System.out.println("Enter the Real part of 2nd Complex number");
        r2=sc.nextInt();
        System.out.println("Enter the Imaginary part of 2nd Complex number");
        i2=sc.nextInt();
        Complex ob=new Complex(r1,i1);/**object creation*/
        Complex ob2=new Complex(r2,i2);/**object creation*/
        System.out.print("First Complex Number:");
        ob.display();
        System.out.print("Second Complex Number:");
        ob2.display();
        System.out.print("Sum of the 2 Complex Numbers:");
        ob2.add(ob).display();
    }/**end of main()*/
}/**end of Sum*/