import java.util.Scanner;
class Rotation
{
    private int a[][],b[][],d[][];
    private int r,c;
    void input()
    {

        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter row and column");
            r=sc.nextInt();
            c=sc.nextInt();
        }while(r<3 || c<3);
        a=new int[r][c];
        System.out.println("Enter "+(r*c)+" array elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                a[i][j]=sc.nextInt();
        }
        System.out.println("Original array:-");
        display(a);
        rot1();
        rot2();
    }

    void rot1()
    {
        b=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=c-1;j>=0;j--)
                b[i][c-1-j]=a[i][j];
        }
        System.out.println("1st Rotation:-");
        display(b);
    }

    void rot2()
    {
        d=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
                d[i][j]=b[r-1-j][i];
        }
        System.out.println("2nd Rotation:-");
        display(d);
    }

    void display(int f[][])
    {
        for(int i=0;i<f.length;i++)
        {
            for(int j=0;j<f[0].length;j++)
                System.out.print(f[i][j]+ "    ");
            System.out.println();
        }
    }
}

class Rot_main
{
    public static void main(String args[])
    {
        new Rotation().input();
    }
}