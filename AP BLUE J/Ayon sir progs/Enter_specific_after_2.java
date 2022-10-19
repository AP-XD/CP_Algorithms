import java.util.*;//enter number after specific position
class Enter_specific_after_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :-");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements :-");
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            System.out.print(a[i]+"\t");
        System.out.println();
        System.out.println("Enter the position present in the array :-");
        int p=sc.nextInt();
        int c=p+1;
        System.out.println("Enter the element to be inserted :-");
        int x=sc.nextInt();
        int a1[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        {
            if(i==c)
            a1[i]=x;
            if(i<c)
                a1[i]=a[i];
            else if(i>c)
                a1[i]=a[i-1];
        }
        for(int i=0;i<n+1;i++)
            System.out.print(a1[i]+"\t");
    }
}