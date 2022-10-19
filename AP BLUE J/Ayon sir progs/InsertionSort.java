import java.io.*;
public class InsertionSort
{
    public static void main(String args[])throws IOException
    {
        int n,i,j,num,b[];       
        System.out.print("Enter the limit : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n= Integer.parseInt(br.readLine());
        int a[]=new int[n];
        System.out.print("\nEnter the numbers : ");
        for(i=0;i<n;i++)
        {
            System.out.print("\nEnter the v.alue of a[ "+i+" ] : ");
            a[i]=Integer.parseInt(br.readLine());
        }       
        System.out.print("\nThe numbers are before Sorting: ");
        for(i=0;i<n;i++)
            System.out.print("\nThe value of a[ "+i+" ] : "+a[i]);
        b=new int[n+1];
        System.out.print("\nEnter the number that u want to insert : ");
        num= Integer.parseInt(br.readLine());
        for(i=0;i<n;i++)
            b[i]=a[i];
        b[n]=num;
        a=new int[n+1];
        a=b;
        n++;
        for(j=1;j<n;j++)
        {
            num=a[j];
            for(i=j-1;i>=0;i--)
            {
                if(a[i]>num)
                    a[i+1]=a[i];
                else
                    break;
            }
            a[i+1]=num;
        }
        System.out.print("\nThe numbers are after Sorting: ");
        for(i=0;i<n;i++)
            System.out.print("\nThe value of a[ "+i+" ] : "+a[i]);       
    }    
}