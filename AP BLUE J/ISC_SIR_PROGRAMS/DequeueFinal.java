class DequeueFinal
{ 
    int q[],f,r,n;
    DequeueFinal(int nn)
    { n=nn;
        q=new int[n];
        f=r=0;
    }

    void pushrear(int v)
    {  if (r<n-1 )
            q[++r] =v;
        else
            System.out.println( "QUEUE IS FULL FROM REAR ");
    }

    int popfront()
    { if(f==r)
            return -999;
        else
            return  q[++f];
    } 

    void pushfront(int v)
    {  if (f>0)
            q[f--] =v;
        else
            System.out.println( "QUEUE IS FULL FROM FRONT ");
    }

    int poprear()
    { if(f==r)
            return -999;
        else
            return  q[r--];
    } 

    void display()
    { for(int i=f+1;i<=r;i++)
            System.out.println(q[i]);
            
    }
}