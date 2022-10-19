import java.util.*;
class T_F_Pattern
{
    int n;
    char a[][];
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        boolean b=false;
        do
        {
            System.out.println("Enter Square Matrix Size");
            n=sc.nextInt();
            int sum=2;
            while(sum<=n)
            {

                if (sum==n)
                {
                    b=true;
                    break;
                }
                sum*=2;
            }
        }while((n<2)||b==false);
        pattern();
    }

    void pattern()
    {
        a=new char[n][n];
        a[0][0]=a[0][1]=a[1][0]='T';
        a[1][1]='F';
        int x=2;
        while(x<=n/2)
        {           
            for(int i=0;i<x;i++)
                for(int j=x;j<(x+x);j++)
                {
                    a[i][j]=a[i][j-x];
                    a[j][i]=a[j-x][i];

                    if(a[i][j-x]=='T')
                        a[i+x][j]='F';
                    else
                        a[i+x][j]='T';
                }           
            x=x+x;
        }
        display();
    }

    void display()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+"   ");
            System.out.println();
        }
    }
}
public class T_F_Pattern_Main
{
    public static void main(String args[])
    {
        T_F_Pattern ob=new T_F_Pattern();
        ob.accept();
    }
} 