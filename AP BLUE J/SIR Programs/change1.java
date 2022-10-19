
import java.util.*;
class change1
{
    void change(int a[])
    {
        int c=0;
        for(int i=0;i<6;i++)
        {
            if((a[i]>9)&&(a[i]<100))
            {
                int t=a[i];
                for(int j=i-1;j>=c;j--)
                    a[j+1]=a[j];
                a[c]=t;
                c++;
                i=c-1;
            }
        }
        for(int i=0;i<6;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[6];
        for(int i=0;i<6;i++)
        {
            System.out.println("Enter the no.");
            a[i]=sc.nextInt();
        }
        new change1().change(a);
    }
}