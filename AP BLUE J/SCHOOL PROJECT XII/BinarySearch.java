import java.util.*;
class BinarySearch
{
    int binSearch(int a[],int l, int u, int v) /**recursive() for binary search*/ 
    {
        int mid=(l+u)/2;/**Variable declaration and initialization*/ 
        if(u<l) /**condition if the search is unsuccessful*/ 
        {
            return -1;
        } 
        if(v==a[mid]) /**condition if the search is successful*/ 
        {
            return mid;
        }
        else if(v>a[mid]) 
        {
            return binSearch(a,mid+1,u,v);
        }
        else
        {
            return binSearch(a,l,mid-1,v);
        }
    }

    void sort(int a[])
    {
        int i,j,t=0;/**Variable declaration and initialization*/ 
        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a.length-i-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    t=a[j];
                    a[j]=a[j+1];/**sorting by bubble sort technique*/
                    a[j+1]=t;
                }
            }
        }
    }

    public static void main(String args[])/**main() declaration*/
    { 
        Scanner sc=new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        System.out.println("Enter Size of array:");
        int n=sc.nextInt(),i,v,r=0,a[]=new int[n];/**Variable declaration and initialization*/ 
        for(i=0;i<n;i++)
        {
            System.out.println("Enter element a["+i+"]:");
            a[i]=sc.nextInt();/**Accepting the elements of Array from User*/
        }
        ob.sort(a);
        System.out.println("Enter element to be searched");
        v=sc.nextInt();
        if (ob.binSearch(a,0,n-1,v)==-1) 
            System.out.println("Element not present");/**Displaying message*/ 
        else
            System.out.println("Element "+v+" is present");/**Displaying message*/
    }/**end of main()*/
}/**end of BinarySearch*/