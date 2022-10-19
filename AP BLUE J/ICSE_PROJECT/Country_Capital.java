import java.util.*;
class Country_Capital
{
    public static void main(String args[])/**main function definition*/
    {
        Scanner sc = new Scanner(System.in);/**object creation*/
        String a[]=new String[10],b[]=new String[10],name;/**variable declaration and initialization*/ 
        int k=0,i;
        for(i = 0;i<10;i++)
        {
            System.out.println("Enter the name of "+(i+1)+" Country : ");
            a[i]=sc.nextLine();
            System.out.println("Enter its Capital : ");
            b[i]=sc.nextLine();
        }
        System.out.println("Enter the name of the Country whose capital is to be searched : ");
        name = sc.nextLine();
        for(i = 0;i<a.length;i++)
        {
            if(name.equals(a[i]))
            { k=1;
              break;
            }
        }
        if(k==1)
            System.out.println("Search successful\nCountry : "+a[i]+"\nCapital : "+b[i]);/**displaying the message*/
        else
            System.out.println("Search unsuccessful,No such country in the list");/**displaying the message*/
    }/**end of main()*/
}/**end of class Country_Capital*/
