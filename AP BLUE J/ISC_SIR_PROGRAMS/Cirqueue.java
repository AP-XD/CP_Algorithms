class Cirqueue
{ 
    int q[],f,r,n;
    Cirqueue(int nn)
    {
        n=nn;
        q=new int[n];
        f=r=0;
    }

    void push(int v)
    {  if( (r+1)%n !=f )
        { r=(r+1)%n; 
            q[r] =v;
        }
        else
            System.out.println( "QUEUE IS FULL ");
    }

    int pop()
    { if(f==r)
            return -999;
        else
        { f=(f+1)%n;
            return  q[f];
        }
    } 

    void display()
    {
        int t=f;
        while(t!=r)
        {
            t=(t+1)%n;
            System.out.println(q[t]);
        }
    }
}