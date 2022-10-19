import java.util.*;
public class Composite
{
    int m,n;
    int arr[][] = new int[m][n];
    Composite(int mm,int nn)
    {
        m=mm;
        n=nn;
    }
    int isComposite(int p)
    {
        int c=0;
        for(int i=1;i<=p;i++)
        {
            if(p%i==0)
            c++;
        }
        if(c>2)
        return 1;
        else
        return 0;
    }
    void fill()
    {
        Scanner sc = new Scanner(System.in);
        int i,j,x=1,k;
        int a[]=new int[n*m];
        while(k!=(n*m))
        {
            j=isComposite(x);
            if(j==1)
            {
                a[k]=x;
                k++;
            }
            x++;
        }
        System.out.println(x);        
        k=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[j][i]=a[k];
                k++;
            }
        }
        System.out.println("Output");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}