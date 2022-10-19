import java.io.*;
class Swap
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private int arr[][],res[][],r,c;
    public void size()throws IOException
    {
        System.out.println("Enter row and coloumn");
        r=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        arr=new int [r][c];
        res=new int [r][c];
    }

    public void ele()throws IOException
    {
        System.out.println("Enter elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                arr[i][j]=Integer.parseInt(br.readLine());
        }
    }

    public void swapping()
    {
        int t;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                res[i][j]=arr[i][j];
        }
        for(int j=0;j<c;j++)
        {
            t=arr[r-1][j];
            res[0][j]=t;
            res[r-1][j]=arr[0][j];
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(res[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String args[])throws IOException
    {
        Swap ob=new Swap();
        ob.size();
        ob.ele();
        ob.swapping();
    }
}

            