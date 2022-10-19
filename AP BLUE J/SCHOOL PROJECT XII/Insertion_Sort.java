import java.util.*;
public class Insertion_Sort
{
    void display(int a[])
    {
        int i;
        for(i=0; i<a.length;i++)
        {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }

    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        Insertion_Sort ob=new Insertion_Sort();/**object creation*/
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int i,j,t=0,a[]= new int[n];/**Variable declaration and initialization*/
        System.out.println("Enter the Array Elements:");
        for(i=0; i<n; i++)
        {
            System.out.print("a["+i+"]:");
            a[i]= sc.nextInt();
        }
        System.out.println("Original Array");
        ob.display(a);/**function calling through object*/
        /**Sorting the Array using Insertion Sort technique*/
        System.out.print("\nSorting Array using Insertion Sort Technique..\n");
        for(i=1; i<n; i++)
        {
            t=a[i];
            j=i-1;
            System.out.println("Pass "+i);            
            while(j>=0 && t<a[j])
            {
                System.out.println("Inside While...");
                a[j+1]=a[j];
                j--;          
                ob.display(a);/**function calling through object*/
            }
            a[j+1]=t;
            System.out.println("Outside While...");
            ob.display(a);/**function calling through object*/
            System.out.println();
        }
        System.out.print("Array after Sorting is :");
        ob.display(a);/**function calling through object*/
    }/**end of main()*/
}/**end of Insertion_Sort*/