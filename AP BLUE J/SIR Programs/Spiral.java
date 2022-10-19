//CIRCULAR
import java.util.Scanner;
class Spiral
{
    void struc()
    {
        System.out.println("enter a word");
        String s=new Scanner(System.in).next();
        int l=s.length();
        for(int i=1;i<=l;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print(s.charAt(j-1)+" ");
            for(int j=1;j<=(l-i)*2-1;j++)
                System.out.print(s.charAt(i-1)+" ");
            for(int j=i;j>=1;j--)
            {
                if( i==l && j==l)
                    continue;
                else
                    System.out.print(s.charAt(j-1)+" ");
            }
            System.out.println();
        }
        for(int i=l-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print(s.charAt(j-1)+" ");
            for(int j=1;j<=(l-i)*2-1;j++)
                System.out.print(s.charAt(i-1)+" ");
            for(int j=i;j>=1;j--)
                System.out.print(s.charAt(j-1)+" ");
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        new Spiral().struc();
    }
}
