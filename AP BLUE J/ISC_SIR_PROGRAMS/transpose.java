import java.io.*;
public class transpose
{
    public static void main()throws IOException
    {
        int a[][]=new int[3][3];
        int arr[][]=new int[3][3];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=Integer.parseInt(br.readLine());
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+"  ");
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=a[j][i];
            }
            System.out.println();
        }
        System.out.println("The resultant transpose matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
