import java.io.*;

class Boundary
{
    int arr[][];
    private int r=0;
    private int c=0;  

    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws  IOException
    {
        do
        {
            System.out.println("Enter the row no.");
            r= Integer.parseInt(br.readLine());
            System.out.println("Enter the column no.");
            c=Integer.parseInt(br.readLine());
        }while(r!=c);

        arr=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter the element of "+i+"th row and "+j+"th column");
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }

    }

    public void check()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i>=1 && i<(r-1) && j==1)
                {
                    for( ;j<(r-1);j++)
                    {
                        System.out.print(" ");
                    }

                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[])throws IOException
    {
        Boundary ob=new Boundary();
        ob.accept();
        ob.check();
    }
}

