import java.util.*;
class Menu_Pat
{
    public static void main(String args[])/**main function definition*/
    {
        int i,j,k;/**variable declaration and initialization*/
        char ch;
        Scanner sc=new Scanner(System.in);/**object creation*/
        System.out.println("Enter 'A' for pattern\nEnter 'B' for sum of series");
        ch=sc.next().charAt(0);
        switch(ch){/**starting of switch block*/
            case 'A':/**starting of case 'A'*/
            for(i=1;i<=6;i++)/**starting of outer for loop*/
            {
                for(j=2;j<=i;j++)
                    System.out.print("  ");
                for(k=i;k<=6;k++)
                {
                    if(k%2==0)
                        System.out.print("# ");/**displaying each element of the series*/
                    else
                        System.out.print("@ ");/**displaying each element of the series*/
                }
                System.out.println();
            }/**end of outer for loop*/
            break;
            case 'B':/**starting of case 'B'*/
            for(i=1;i<=5;i++)/**starting of outer for loop*/
            {
                for(j=1;j<=i;j++)
                    System.out.print(j*i+"\t");
                System.out.println();
            }/**end of outer for loop*/
            break;
            default:/**starting of default case*/
            System.out.println("Wrong Choice");/**displaying the message*/
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Menu_Pat*/