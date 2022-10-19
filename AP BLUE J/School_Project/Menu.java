import java.util.*;
class Menu
{
    public static void main(String args[])/**main function definition*/
    {
        int i,j,k,s=0,n;
        char ch;/**variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' for pattern\nEnter 'b' for sum of series");
        ch=sc.next().charAt(0);
        switch(ch){/**starting of switch block*/
            case 'a':/**starting of case 'a'*/
            for(i=1;i<=9;i+=2)/**starting of outer for loop*/
            {
                for(j=2;j<=i;j+=2)
                    System.out.print("  ");
                for(k=i;k<=9;k+=2)
                    System.out.print(k+" ");/**displaying each element of the series*/
                System.out.println();
            }/**end of outer for loop*/
            break;
            case 'b':/**starting of case 'b'*/
            System.out.println("Enter number of terms");
            n=sc.nextInt();
            for(i=1;i<=n;i++){
                s+=(i*i-1)*Math.pow(-1,i+1);
            } 
            System.out.println("Sum of series:"+s);/**displaying sum of the series*/
            break;
            default:/**starting of default case*/
            System.out.println("Wrong Choice");/**displaying the message*/
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Menu*/