import java.util.*;
class Transpose_Mirror
{    
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the order of the matrix(n)=");/**Accepting order of Matrix from User*/
        int s=sc.nextInt(),a[][]=new int[s][s],i,j;/**Variable declaration and initialization*/
        System.out.println("Enter the elements of the Matrix");
        for (i=0;i<s;i++)
        {
            for (j=0;j<s;j++)
            {
                System.out.print("a["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();/**Accepting elements from User*/
            }
        }
        System.out.println("The Matrix is:");
        for (i=0;i<s;i++)
        {
            for (j=0;j<s;j++)
            {
                System.out.print(a[i][j]+"  ");/**Displaying the Original Matrix*/
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix is:");
        for (i=0;i<s;i++)
        {
            for (j=0;j<s;j++)
            {
                System.out.print(a[j][i]+"  ");/**Displaying the Transpose Matrix*/
            }
            System.out.println();
        }
        System.out.println("Mirror Image of Transpose Matrix is:");
        for (i=0;i<s;i++)
        {
            for (j=s-1;j>=0;j--)
            {
                System.out.print(a[j][i]+"  ");/**Displaying the Mirror Image of Transpose Matrix*/
            }
            System.out.println();
        }
    }/**end of main()*/
}/**end of Transpose_Mirror*/