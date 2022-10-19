import java.util.*;
class Rearrange
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        int s;/**Instance variable declaration*/
        do
        {
            System.out.print("Enter Limit of the array:");/**Accepting size of Array from User*/
            s=sc.nextInt();
        }while(s>20);
        int a[]=new int[s],r[]=new int[s],i,j,t=0,k=0,m=s-2,y=0;/**Variable declaration and initialization*/
        for (i=0;i<s;i++)
        {
            System.out.print("Enter the Number:");
            a[i]=sc.nextInt();/**Accepting the elements of Array from User*/
        }
        for(i=0;i<s;i++)
        {
            for(j=0;j<s;j++)
            {
                if(a[i]==a[j])
                    t++;
            }
            if(t>1)
            {y=1;break;}
            t=0;
        }
        if(y==1)
        {
            System.out.println("Duplicate elements found\nExiting program...");
            return ;
        }
        System.out.println("Original array");
        for (i=0;i<s;i++)
            System.out.print(a[i]+"  ");
        /**Sorting the Array using Bubble Sort technique*/ 
        for (i=0;i<s;i++)
        {
            for(j=0;j<s-i-1;j++)
            {
                if (a[j+1]<a[j])
                {   t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
            }
        }
        /**Rearranging the Array according to the question*/
        if(s%2==0)
            k=1;
        else
            k=0;
        r[(s-1)/2]=a[s-1];
        for (i=0;i<s;i++)
        {
            if (i<(s-1)/2)
            {r[i]=a[k];k+=2;}
            else if(i>(s-1)/2)
            {r[i]=a[m];m-=2;}
        }
        /**Displaying the Rearranged Array*/
        System.out.println("\nRearrange array");
        for (i=0;i<s;i++)
            System.out.print(r[i]+"  ");
    }/**end of main()*/
}/**end of Rearrange*/      