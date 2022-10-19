import java.util.*;
class Lucky
{
    Scanner sc=new Scanner(System.in);
    private int a[];
    private int size;
    public void dele(int pos)
    {
        for (int j=pos;j<size-1;j++)
        {
            a[j]=a[j+1];
        }
        a[size-1]=0;    
    }

    public void print(int ns)
    {
        System.out.println("The lucky number");
        for(int i=0;i<ns;System.out.print(a[i]+" "),i++);
    }

    public void printFirst()
    {
        System.out.println("Original Array");
        for(int i=0;i<size;System.out.print(a[i]+" "),i++);
        System.out.println();
    }

    public void enter()
    {
        System.out.println("Enter Elements");
        for(int i=0;i<size;a[i]=sc.nextInt(),i++);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Lucky ob= new Lucky();
        System.out.println("Enter size");
        ob.size =sc.nextInt();
        ob.a=new int[ob.size];
        ob.enter();
        ob.printFirst();
        int n=1;
        for (int i=2;i<ob.size/2;i++)    //The numbers to be checked
        {
            for (int j=ob.size-1;j>=0;j--)     //The positions to be Checked
            {
                if((j+1)%i==0)
                    ob.dele(j);
            }
        }
        n=0;
        for(int i=0;i<ob.size;i++)
        {
            if(ob.a[i]>0)
                n++;
        }
        ob.print(n);
    }
}