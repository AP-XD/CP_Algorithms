import java.util.*;
class HalfAscHalfDes
{
    public void accept()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size");
       int s=sc.nextInt();
       int arr[]=new int[s];
       for(int i=0;i<s;i++)
       {
          System.out.println("Enter the "+(i+1)+" element");
          arr[i]=sc.nextInt();
       }
       System.out.println("Showing the original array");
       show(arr);
       ascend(arr);
       descend(arr);
       System.out.println("Showing the sorted array");
       show(arr);
    }
    public void ascend(int arr[])
    {
        for(int i=0;i<(arr.length/2-1);i++)
        {
            for(int j=0;j<(arr.length/2-i-1);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void descend(int arr[])
    {
        for(int i=0;i<(arr.length)/2-1;i++)
        {
            for(int j=(arr.length/2);j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public void show(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
}
class HalfAscHalfDesMain
{
     public static void main(String args[])
     {
         HalfAscHalfDes ob=new HalfAscHalfDes();
         ob.accept();
     }
}
    