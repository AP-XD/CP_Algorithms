//Keith no.

import java.util.*;
class KeithNo
{
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        int l, u;
        
        do{
            System.out.println("Enter lower and upper limit");
            l=sc.nextInt();
            u=sc.nextInt();
        }while(l>u);
        for(int i=l;i<=u;i++){
        if(isKeith(i))
        System.out.println(" Keith no."+i);
        }
     }
    boolean isKeith(int n)
    {
        int k=n;
        int d=0;
        while(k>0)
        {
            d++;
            k=k/10;
        }
        int arr[]=new int[d];
        k=n;
        for(int i=d-1;i>=0;i--)
        {
            arr[i]=k%10;
            k=k/10;
        }
        
        while(arr[d-1]<n)
        {
            int sum=0;
            for(int i=0;i<d;i++)
            sum=sum+arr[i];
            
            for(int i=0;i<d-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[d-1]=sum;
        }
        if(arr[d-1]==n)
      return true;
        else
      return false;
        
    }
}
/**public class KeithNo_Main
{
    public static void main(String args[])
    {
        KeithNo ob=new KeithNo();
        ob.accept();
    }
}*/
