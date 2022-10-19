import java.util.*;
class Wonder
{
    Scanner sc=new Scanner(System.in);
    private int n;
    private int arr[][];
    public void size()
    {
        do
        {
            System.out.println("Enter order of matrix(2-10)");
            n=sc.nextInt();
        }while(n<2 || n>10);
        arr=new int [n][n];
    }

    public void elements()
    {
        System.out.println("Enter elements");
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
                System.out.println("It is Not a Wondrous Square");
                break;
            }
        }
        if(k!=1);
        System.out.println("It is a Wondrous Square");
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

    public void calc()
    {
        int l=0,m=0,c=0;
        System.out.println("Number     Row Index     Coloumn Index");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                l=arr[i][j]-1;
                for(int k=2;k<=l;k++)
                {
                    m=arr[i][j]%k;
                    if(m!=0)
                    {
                        c=c+1;
                    }
                }
                if(c==(l-1))
                    System.out.println(arr[i][j]+"             "+i+"             "+j);
                c=0;    
            }
        }
        System.out.println();
        System.out.println();
    }

    public static void main(String args[])
    {
        Wonder ob=new Wonder();
        System.out.println("INPUT :- ");
        ob.size();
        ob.elements();
        ob.show();
        System.out.println("OUTPUT :- ");
        ob.check();
        ob.calc();
    }
}