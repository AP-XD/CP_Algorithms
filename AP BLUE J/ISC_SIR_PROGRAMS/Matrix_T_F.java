import java.util.*;
class Matrix_T_F
{
    void input()
    {
        System.out.println("Enter size of array");
        int s = new Scanner(System.in).nextInt();
        boolean arr[][] = new boolean[s][s];
        for(int i=0;i<s;i++)
            for(int j=0;j<s;j++)
                arr[0][0]= !arr[0][0];
        boolean a[][] = modify(arr);
        System.out.println("Array=");
        for(int i=0;i<s;i++)
        {
            for(int j=0;j<s;j++)
            {
                if(arr[i][j]==true)
                    System.out.print("F ");
                if(arr[i][j]==false)
                    System.out.print("T ");
            }
            System.out.println();
        }
    }

    boolean[][] modify(boolean arr[][])
    {
        int s=arr.length;
        if(s!=2)
        {
            boolean a[][]= new boolean[s/2][s/2];
            boolean b[][]= new boolean[s/2][s/2];
            boolean c[][]= new boolean[s/2][s/2];
            boolean d[][]= new boolean[s/2][s/2];
            for(int i=0;i<s/2;i++)
                for(int j=0;j<s/2;j++)
                {
                    a[i][j]=arr[i][j];
                    b[i][j]=arr[i][j+(s/2)];
                    c[i][j]=arr[i+(s/2)][j];
                    d[i][j]= !arr[i+(s/2)][j+(s/2)];
                }
            a = modify(a);
            b = modify(b);
            c = modify(c);
            d = modify(d);
            for(int i=0;i<s/2;i++)
                for(int j=0;j<s/2;j++)
                {
                    arr[i][j]=a[i][j];
                    arr[i][j+(s/2)]=b[i][j];
                    arr[i+(s/2)][j]=c[i][j];
                    arr[i+(s/2)][j+(s/2)]=d[i][j];
                }
            return arr;
        }
        arr[1][1]= !arr[1][1];
        return arr;
    }
}
