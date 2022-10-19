import java.util.*;
class DQueeue
{
    int f,r,a[];
    public DQueeue(int nn)
    {
        f=-1;
        r=-1;
        a=new int[nn];
    }

    public void insertFornt( int item)
    {
        if((f==-1) || ((f==r) &&((f==0)&&((r==0))))||((f==0)&&(f!=r)))
            System.out.println("\n"+"Queue overflow"+"\n");
        else  
        {
            a[--f]=item;
        }
    }

    public void insertRear( int item)
    {
        if(r==a.length-1)
            System.out.println("\n"+"Queue overflow"+"\n");
        else if(r==-1)
        {
            f=0;
            r=0;
            a[r]=item;
        }
        else
        {
            a[++r]=item;
        }
    }

    public void deleteFront()
    {
        if(f==-1)
            System.out.println("\n"+"Queue underflow"+"\n");
        else
        {
            int x=a[f];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                f++;
                System.out.println("\n"+x+" is deleted"+"\n");
            }
        }
    }

    public void deleteRear()
    {
        if(r==-1)
            System.out.println("\n"+"Queue underflow"+"\n");
        else
        {
            int x=a[r];
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
            {
                r--;
                System.out.println("\n"+x+" is deleted"+"\n");
            }
        }
    }

    void display()
    {
        if(f==-1)
            System.out.println("\n"+"Queue empty"+"\n");
        else
        {
            System.out.println("\n"+"Queeue"+"\n ");
            for(int i=f;i<=r;i++)
                System.out.print(a[i]+"  ");
            System.out.println();
        }
    }

    void menu()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1 to insert no. in Queeue"+"\n"+"Enter 2 to delete no."+"\n"+"Enter 3 to display"+"\n"+"Enter 4 to exit");
        int ch=s.nextInt();
        switch(ch)
        {
            case 1: System.out.println("\n"+"Enter 1 to insert no. from FRONT END"+"\n"+"Enter 2 to insert no. from REAR END"+"\n");
            int p=s.nextInt();
            System.out.println("\n"+"Enter no. to be inserted"+"\n"); 
            int o=s.nextInt();
            switch(p)
            {
                case 1: insertFornt(o);
                break;
                case 2: insertRear(o);
                break;
                default: System.out.println("\n"+"Wrong choice"+"\n");
            }
            menu();
            case 2: System.out.println("\n"+"Enter 1 to delete no. from FRONT END"+"\n"+"Enter 2 to delete no. from REAR END"+"\n");
            int y=s.nextInt();
            switch(y)
            {
                case 1: deleteFront();
                break;
                case 2: deleteRear();
                break;
                default: System.out.println("\n"+"Wrong choice"+"\n");
            }
            menu();
            case 3: display();
            menu();
            case 4: System.exit(0);
            default: System.out.println("\n"+"Wrong choice"+"\n");
            menu();
        }
    }// end of class DQueeue
}
