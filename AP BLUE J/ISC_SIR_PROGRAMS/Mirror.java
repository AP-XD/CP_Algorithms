import java.util.*;
class Mirror {
    private int m ;
    private int a[][];
    private int arr[][];
    Scanner sc = new Scanner(System.in);
    void calc()
    {
        System.out.println("Enter Size");
        m = sc.nextInt();
        a=new int [m][m];
        arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=(m-1);j>=0;j--)
            {
                arr[i][c++]=a[i][j];
            }
            c=0;
        }
        System.out.println("Original Matrix");
        disp(a);
        System.out.println("Mirror Matrix");
        disp(arr);
    }

    void disp(int s[][])
    {
        for(int i=0;i<s[0].length;i++)
        {
            for(int j=0;j<s.length;j++)
            {
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
}
