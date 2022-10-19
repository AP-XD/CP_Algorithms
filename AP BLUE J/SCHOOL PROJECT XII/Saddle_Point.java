import java.util.*;
class Saddle_Point
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        int n;
        do
        {
            System.out.print("Enter the order of the matrix(N):");
            n=sc.nextInt();
        }while(n>=20);
        int A[][]=new int[n][n],i,j,k,max,min,x,f=0,t=0;/**Variable declaration and initialization*/
        System.out.println("Inputting the elements in the matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print("Enter Element at A["+i+"]["+j+"]: ");
                A[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<n;i++)
        {
            /** Finding the minimum element of a row */
            min=A[i][0]; /**Initializing min with first element of every row*/
            x=0;
            for(j=0;j<n;j++)
            {
                if(A[i][j]<min)
                {
                    min=A[i][j];
                    x=j; /** Saving the column position of the minimum element of the row*/
                }
            }
            /**Finding the maximum element in the column corresponding to the minimum element of row*/
            max = A[0][x]; /** Initializing max with first element of that column*/
            for(k=0;k<n;k++)
            {
                if(A[k][x]>max)
                {
                    max=A[k][x];
                    t=k;/** Saving the row position of the maximum element of the column*/
                }
            }
            /** If the minimum of a row is same as maximum of the corresponding column, then, we have that element as the Saddle point */
            if(max==min)
            {
                System.out.println("\nSaddle point = "+max+"("+t+","+x+")");
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("\nNo saddle point");
        }
        /** Printing the Original Matrix */       
        System.out.println("\nThe Original Matrix A[][]=");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        }
    }/**end of main()*/
}/**end of Saddle_Point*/