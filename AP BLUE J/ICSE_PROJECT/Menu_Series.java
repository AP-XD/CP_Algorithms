import java.util.*;
class Menu_Series
{
    void sum(int n)/**sum(int) function definition*/
    {
        int i,k=4;/**variable declaration and initialization*/
        double s=0.0;
        for(i=1;i<=n;i++,k+=4)
            s+=1.0/k;
        System.out.println("Sum of series:"+s);/**displaying sum of the series*/
    }

    void sum(int x,int n)/**sum(int,int) function definition*/
    {
        int i,j;/**variable declaration and initialization*/
        double s=0.0,p=1.0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
                p*=j;
            s+=i*x/p*Math.pow(-1,i+1);/**calculating sum of series*/
            p=1.0;
        } 
        System.out.println("Sum of series:"+s);/**displaying sum of the series*/
    }

    /**end of sum()*/

    public static void main(String args[])/**main function definition*/
    {
        int ch,n,x;/**variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);/**object creation*/
        Menu_Series ob=new Menu_Series();/**object creation*/
        System.out.println("Enter 1 for sum of Series 1\nEnter 2 for sum of Series 2");
        ch=sc.nextInt();
        switch(ch){/**starting of switch block*/
            case 1:/**starting of case 1*/
            System.out.println("Enter number of terms");
            n=sc.nextInt();
            ob.sum(n);/**function calling through object*/
            break;
            case 2:/**starting of case 2*/
            System.out.println("Enter number of terms");
            n=sc.nextInt();
            System.out.println("Enter a number");
            x=sc.nextInt();
            ob.sum(x,n);/**function calling through object*/
            break;
            default:/**starting of default case*/
            System.out.println("Wrong Choice");/**displaying the message*/
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Menu_Series*/