import java.util.*;
class Wages extends Worker
{
    int hrs, rate;
    double wage;/**Instance variable declaration*/
    Wages(String n, double b, int h, int r)/**parameterized constructor*/
    {
        super(n,b);/**calling of super class constructor for initialization of variables*/
        hrs=h;
        rate=r;
        wage=0.0;
    }

    double overtime()
    {
        return (hrs*rate);
    }

    public void display()
    {
        super.display ();/**calling of super class method to display other details*/
        wage = overtime()+ Basic; 
        System.out.println("Hours Worked:"+hrs+"\nRate:"+rate+"\nWage:"+wage);/**Displaying the output*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NAME of worker:");
        String n=sc.nextLine();
        System.out.print("Enter Basic pay of worker:");
        double b=sc.nextDouble();
        System.out.print("Enter Hours worked by worker:");
        int h=sc.nextInt(),r;
        System.out.print("Enter Rate:");
        r=sc.nextInt();
        Wages ob=new Wages(n,b,h,r);/**Object creation*/
        ob.display();/**Function Calling*/
    }/**end of main()*/
}/**end of class Wages*/