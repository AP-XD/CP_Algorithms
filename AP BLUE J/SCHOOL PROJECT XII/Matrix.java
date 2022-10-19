 

import java.util.*;
class Matrix
{
    int a[][];/**Instance variable declaration*/
    public void row_Wise_Sum(int a[][],int n)/**Starting of row_Wise_Sum(int[][],int)*/
    {
        int s=0,i,j;/**Variable description and initialization*/
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            { 
                s+=a[i][j];/**Calculating row sum*/
            }
            System.out.println((i+1)+" row sum="+s);/**Displaying row sum*/
            s=0;/**Reinitializing s to 0*/
        }
    }

    public void right_Uptriangle(int a[][],int n)/**Starting of right_Uptriangle(int[][],int)*/
    {
        int i,j;/**Variable description and initialization*/
        System.out.println("Displaying Right up triangle");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            { if(j>=i)
                    System.out.print(a[i][j]+" ");/**Displaying right upper triangular elements*/
                else
                    System.out.print("  ");
            }
            System.out.println();/**Moving cursor to next line*/
        }
    }

    public void min_2(int a[][],int n)/**Starting of min_2(int[][],int)*/
    {
        int min=a[0][0],min2,max=0,i,j;/**Variable description and initialization*/
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            { 
                if(min>a[i][j])
                {
                    min=a[i][j];/**Finding the minimum element of the matrix*/
                }
                if(a[i][j]>max)
                    max=a[i][j];/**Finding the maximum element of the matrix*/
            }
        }
        min2=max;/**Initializing min2 to the minimum element of the matrix*/
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            { 
                if(a[i][j]==min)
                    a[i][j]=max;/**Changing the minimum element of the matrix to maximum element of the matrix*/
                if(min2>a[i][j])
                    min2=a[i][j];/**Finding the second minimum element of the matrix*/
            }
        }
        System.out.println("2nd minimum number of the matrix="+min2);/**Displaying 2nd minimum number in the matrix*/
    }

    public void getData()/**Starting of getData()*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of matrix");
        int n=sc.nextInt(),i,j;/**Variable description and initialization*/
        a=new int [n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter element");
                a[i][j]=sc.nextInt();/**Accepting element from user*/
            }
        }
    }

    public void display(int a[][],int n)/**Starting of display(int[][],int)*/
    {
        int i,j;
        System.out.println("Displaying the matrix entered by user");
        for(i=0,j=0;i<n;)
        {
            if(j<n)
                System.out.print(a[i][j++]+" ");/**Displaying the element of the matrix in one loop*/
            if(j==n)
            {
                i++;j=0;
                System.out.println();
            }
        }
    }

    public static void main(String args[])/**main() declaration*/
    {
        Matrix ob=new Matrix();/**Object creation*/
        ob.getData();/**Function Calling*/
        int n=ob.a.length;
        ob.display(ob.a,n);/**Function Calling*/
        ob.row_Wise_Sum(ob.a,n);/**Function Calling*/
        ob.right_Uptriangle(ob.a,n);/**Function Calling*/
        ob.min_2(ob.a,n);/**Function Calling*/
    }/**end of main()*/
}/**end of Matrix*/