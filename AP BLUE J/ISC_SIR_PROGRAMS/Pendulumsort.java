import java.util.*;
class Pendulumsort{
    public static void main (String args [])
    {
        System.out.print("Enter the length of an array:");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter the positive integers of an array:");
        for(int i=0;i<n;i++)
        {array[i]=sc.nextInt();
            while(array[i]<=0)
            {System.out.println("Last entry was invalid.Enter again.");
                array[i]=sc.nextInt();
            } 
        }
        System.out.println("Warning:If any of your entries were not positive integers, necessary changes might have been made to convert them into integers");    
        Pendulumsort ob=new Pendulumsort();
        ob.pendulumsort(array);
    }

    void pendulumsort(int a[])
    {
        int min=0, max=0, mid=a.length/2, t=0;
        for(int i=1;i<a.length;i++)
        {
            if(a[min]>a[i])
                min=i;
        }
        t=a[min];
        a[min]=a[mid];
        a[mid]=t;
        int lowerbound=mid;
        int y=mid-1;
        int x=mid+1;
        for(int i=1;i<a.length-1;i++)
        {
            max=0;
            for(int j=1;j<a.length;j++)
            {
                if(j==lowerbound)
                    continue;
                else if(a[j]>=a[lowerbound] && a[j]<a[max])
                    max=j;
            }
            if(i%2==0){
                t=a[max];
                a[max]=a[y];
                a[y]=t;
                lowerbound=y;
                --y;
            }
            else{
                t=a[max];
                a[max]=a[x];
                a[x]=t;
                lowerbound=x;
                ++x;
            }
        }
        System.out.println("The resultant array is:");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}