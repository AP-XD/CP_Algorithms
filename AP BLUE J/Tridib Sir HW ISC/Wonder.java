import java.util.*;
class Wonder
{
    Scanner sc=new Scanner(System.in);
    int n,arr[][];
    public void accept()
    {
        do
        {
            System.out.println("Enter order of matrix between 2-10");
            n=sc.nextInt();
        }while(n<2 || n>10);
        arr=new int [n][n];
        System.out.println("Enter elements:\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]=sc.nextInt();
        }
    }

    public void check()
    {
        int c,r,sr,sc,k=0;
        int sum=n*(n*n+1)/2;
        for(int i=0;i<n;i++)
        {
            c=i;r=i;
            sr=0;sc=0;
            for(int j=0;j<n;j++)
            {
                sr+=arr[r][j];
                sc+=arr[j][c];
            }
            if((sr!=sum)||(sc!=sum))
            {
                k=1;
                System.out.println("Not a Wondrous Square");
                break;
            }
        }
        if(k!=1);
        System.out.println("YES It Represents a Wondrous Square");
    }

    public void show()
    {
        System.out.println("The Matrix is.........");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(arr[i][j]+"  ");
            System.out.println();
        }
    }

    boolean isprime(int x)
    { int c=0;
        for(int i=2;i<=x;i++)
            if(x%i==0)
                c++;

        if(c==1)
            return true;
        else return false;
    }

    public void calc()
    {
        System.out.println("Number\tRow Index\tColoumn Index");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isprime(arr[i][j]))
                    System.out.println(arr[i][j]+"\t\t"+i+"\t\t"+j);   
            }
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Wonder ob=new Wonder();
        ob.accept();
        ob.show();
        ob.check();
        ob.calc();
    }
}