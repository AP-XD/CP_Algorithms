import java.util.*;
class Matrix_Mul 
{
    void display(int m[][])
    {
        int i,j,s=m[0].length;/**Variable declaration and initialization*/;
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
                System.out.print(m[i][j]+" ");
            System.out.println();
        }
    }

    public static void main(String[] args)/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        Matrix_Mul ob=new Matrix_Mul();
        System.out.println("Enter order of 1st and 2nd Square matrix");
        int s=sc.nextInt();
        int m1[][]=new int [s][s],m2[][]=new int [s][s],p[][]=new int [s][s],i,j,k;/**Variable declaration and initialization*/
        System.out.println("Enter the elements of 1st Square matrix");
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                System.out.print("m1["+i+"]["+j+"]:");
                m1[i][j]=sc.nextInt();/**Accepting the elements of 1st Matrix  from User*/
            }
        }
        System.out.println("Enter the elements of 2nd Square matrix");
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                System.out.print("m2["+i+"]["+j+"]:");
                m2[i][j]=sc.nextInt();/**Accepting the elements of 1st Matrix  from User*/
            }
        }
        /** Mutliplying Two matrices*/
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                for (k=0;k<s;k++)
                {
                    p[i][j]+= m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println("The 1st Matrix is:");
        ob.display(m1);/**function calling through object*/
        System.out.println("The 2nd Matrix is:");
        ob.display(m2);/**function calling through object*/
        System.out.println("The Product Matrix is:");
        ob.display(p);/**function calling through object*/
    }/**end of main()*/
}/**end of Matrix_Mul*/