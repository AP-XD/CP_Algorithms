import java.util.*;
class Combine
{ 
    int com[],size;/**Instance variable declaration*/
    static Scanner sc=new Scanner(System.in);
    Combine(int nn)/**parametrized constructor*/
    {
        size=nn;
        com=new int[size];
    }

    void inputarray()
    { 
        System.out.print("\nEnter "+size+" elements\n");
        int i;/**Variable declaration and initialization*/
        for(i=0;i<size;i++)
        {
            System.out.print("["+i+"]:");
            com[i]=sc.nextInt();/**Accepting elements of array from user*/
        }
    }

    void sort()
    {
        int i,j,m,t;/**Variable declaration and initialization*/
        for(i=0;i<size-1;i++)
        { 
            m=i;
            for(j=i+1;j<size;j++)
            { if(com[m]>com[j])
                    m=j;
            }
            if(m!=i)
            {
                t=com[m];
                com[m]=com[i];/**sorting array using selection sort technique*/
                com[i]=t;
            }
        }
    }

    void mix(Combine A,Combine B)
    { 
        int x=0,y=0,z=0;/**Variable declaration and initialization*/
        while(x<A.size)
            com[z++]=A.com[x++];
        while(y<B.size)/**Combining both arrays*/
            com[z++]=B.com[y++];
    }

    void display( )
    {
        int i;/**Variable declaration and initialization*/
        for(i=0;i<size;i++)
            System.out.println("["+i+"]:"+com[i]);/**Displaying the array*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        System.out.print("Enter size of first array:");
        int a=sc.nextInt();/**Accepting 1st array size from user*/
        System.out.print("\nEnter size of second array:");
        int b=sc.nextInt();/**Accepting 2nd array size from user*/
        Combine P=new Combine(a);
        Combine Q=new Combine(b);
        Combine R=new Combine(a+b);
        P.inputarray();/**calling method via object P*/
        Q.inputarray();/**calling method via object Q*/
        R.mix(P,Q);/**calling method via object R*/
        R.sort();/**calling method via object R*/
        System.out.println("\nThe combined sorted array:");
        R.display();/**calling method via object R*/
    }/**end of main()*/
}/**end of Combine*/