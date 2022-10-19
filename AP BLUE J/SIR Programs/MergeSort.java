import java.io.*;
class MergeSort
{
  private int arr1[];
  private int arr2[];
  private int arr[];
  public void getdata()throws IOException
  {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      //for the arr1[]
      System.out.println("Enter size of the array 1");
      int s=Integer.parseInt(br.readLine());
      arr1=new int[s];
      // elements of arr1[]
      System.out.println("Entering the elements of the array 1");
      for(int i=0;i<s;i++)
      {
          arr1[i]=Integer.parseInt(br.readLine());
        }
        //sorting arr1[]
        for(int i=0;i<s-1;i++)
        {
            for(int j=0;j<s-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        //showing arr1[]
        System.out.println("Showing the array 1");
        for(int i=0;i<s;i++)
        {
            System.out.println(arr1[i]);
        }
       //for the arr2
      System.out.println("Enter size of the array 2");
      int p=Integer.parseInt(br.readLine());
      arr2=new int[p];
        // elements of arr2[]
      System.out.println("Entering the elements of the array 2");
      for(int i=0;i<p;i++)
      {
          arr2[i]=Integer.parseInt(br.readLine());
        }
        //sorting arr2[]
        for(int i=0;i<p-1;i++)
        {
            for(int j=0;j<p-i-1;j++)
            {
                if(arr2[j]>arr2[j+1])
                {
                    int tempt=arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=tempt;
                }
            }
        }        
        //showing arr1[]
        System.out.println("Showing the array 2");
        for(int i=0;i<p;i++)
        {
            System.out.println(arr2[i]);
        }
    }
    //Merge Sort Starts
    public void mergeSort()
    {
        int m=arr1.length;
        int n=arr2.length;
        int c1=0,c2=0,c=0;
        arr=new int[m+n];
        while((c1<m)&&(c2<n))
        {
            if(arr1[c1]<arr2[c2])
            { 
                arr[c]=arr1[c1];
                c++;
                c1++;
            }
            else
                arr[c++]=arr2[c2++];
            }
            while(c1<m)
            {
                arr[c++]=arr1[c1++];
            }
            while(c2<n)
            {
                arr[c++]=arr2[c2++];
            }
        System.out.println("Showing the merge sorted array");
        for(int i=0;i<m+n;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

        