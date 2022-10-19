import java.io.*;
public class BurningTree
{

    private int[][] a;
    private int n;
    public void get()throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do
        {
            System.out.print("Enter the Order of the Garden : ");
            n= Integer.parseInt(br.readLine());
            if(n<3) System.out.println(" Order must be atleast 3 \n");
            else a = new int[n+2][n+2];            
        }while(n<3);

        System.out.println("\n Press Enter To Continue ");
        br.readLine();
        System.out.println("\f");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                a[i][j]= (int)(Math.random()*2);
            }
        }
        System.out.print("\n This is the original garden : - \n\n");
        display();

        System.out.println("Enter the Location to set Fire : - ");
        System.out.print("Enter the Row Number : ");
        int r = Integer.parseInt(br.readLine());
        System.out.print("Enter the Column Number : ");
        int c =Integer.parseInt(br.readLine());
        burn(r,c);

        System.out.print("\n\n Press Enter to Continue ");
        br.readLine();
        System.out.print("\n This is the garden after fire is put off: - \n\n");
        display();

    }

    public void burn(int r,int c)throws IOException
    { 
        if(a[r][c]==1) 
        {
            a[r][c]=2;
            if(a[r-1][c-1] ==1) burn(r-1,c-1);
            if(a[r-1][c] ==1)   burn(r-1,c);
            if(a[r-1][c+1] ==1) burn(r-1,c+1);
            if(a[r][c-1] ==1)   burn(r,c-1);
            if(a[r][c+1] ==1)   burn(r,c+1);
            if(a[r+1][c-1] ==1) burn(r+1,c-1);
            if(a[r+1][c] ==1)   burn(r+1,c);
            if(a[r+1][c+1] ==1) burn(r+1,c+1);

        }

    }

    public void display()throws IOException
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                System.out.print((a[i][j]==0 ? "...":(a[i][j]==1 ? "<#>":"!!!"))+ " " );
            System.out.println();
        }
        System.out.println();

    }
}