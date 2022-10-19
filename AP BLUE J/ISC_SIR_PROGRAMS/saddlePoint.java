
/**
 * a program to count the no.of saddle points
 * in a given matrix
 */
import java.io.*;/*java io package is imported*/
public class saddlePoint
{
    int i,j,k,g;
    int t=0,m;
    int a[][],r,c;//instant variable declaration
    int max,min;
    public void input()throws IOException
    {             //method to take the matrix as input     
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter row");
        r=Integer.parseInt(br.readLine());
        System.out.println("enter column");
        c=Integer.parseInt(br.readLine());
        a = new int[r][c];
        System.out.println("enter array elements");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }
        /**
         * displaying the matrix
         * in the actual form
         */
        System.out.println();
        System.out.println("the matrix");
        System.out.println();
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public void compute()
    {          // method to compute the saddle point
        for(i=0;i<r;i++)
        {
            max=a[i][0];
            for(j=1;j<c;j++)
            {
                if(max<a[i][j])
                {
                    max=a[i][j];
                    g=j;
                }
            }
            min=a[0][g];
            for(k=1;k<r;k++)
            {
                if(min>a[k][g])
                {
                    min=a[k][g];
                    m=k;
                }
            }
            if((min==max)&&(m==i))
            {
                System.out.println(+i+" "+g);
                t=t+1;
            }
        }
        System.out.println("no.of saddle points =" +t);
    }
}
