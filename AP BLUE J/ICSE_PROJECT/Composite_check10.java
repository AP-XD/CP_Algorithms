import java.util.*;
class Composite_check10
{
    int a[];/**class variable declaration and initialization*/
    void accept()/**accept() function definition*/ 
    {
        Scanner sc =new Scanner(System.in);/**object creation*/
        a=new int[10];
        int i;/**variable declaration and initialization*/
        for(i=0;i<10;i++)
        {
            System.out.println("Enter a number");
            a[i]=sc.nextInt();
        }
    }
    boolean check(int x)/**check() function definition*/ 
    {
        int i,c=0;/**variable declaration and initialization*/
        for(i=1;i<=x;i++)
            if(x%i==0)
                c++;
        if(c>2)
            return true;
        else
            return false;
    }
    void display()/**display() function definition*/ 
    {
        int i,s=0;/**variable declaration and initialization*/
        double avg=0.0,t=0.0;
        for(i=0;i<10;i++)
        {
            if(check(a[i]))
            {
                System.out.println("Composite Number "+a[i]+" in "+i+" position");/**displaying the message*/
                s+=a[i];
                t++;
            }
        }
        avg=s/t;
        System.out.println("Sum of composite numbers:"+s+"\nAverage of composite numbers:"+avg);/**displaying the message*/
    }
    public static void main(String []args)
    {
        Composite_check10 ob=new Composite_check10();/**object creation*/
        ob.accept();/**function calling through object*/
        ob.display();/**function calling through object*/
    }/**end of main()*/
}/**end of class Composite_check10*/