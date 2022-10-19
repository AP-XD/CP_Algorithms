import java.io.*;
public class InsertionSort
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    private int arr[];
    private int n;
    public void data()throws IOException
    {
        System.out.println("Enter the size of array ");
        n=Integer.parseInt(br.readLine());
        arr=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter array element ");
            arr[i]=Integer.parseInt(br.readLine());
        }//end of for
        System.out.println("Original array is ");
        show();
        sort();
    }//end of void

    public void show()throws IOException
    {
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }//end of void


    public void sort()throws IOException
    {
        for(int i=1;i<n;i++)
        {
            int j=i;
            int b=arr[i];
            while((j > 0)&&(arr[j-1]>b))
            {
                arr[j]=arr[j-1];
                j--;
            }//end of while
            arr[j]=b;
        }//end of for
        System.out.println("Showing sorted array ");
        show();
    }//end of void

    public static void main(String args[])throws IOException
    {
        InsertionSort ob=new InsertionSort();
        ob.data();
    }//end of main
}//end of class
