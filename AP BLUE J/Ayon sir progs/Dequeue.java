class Dequeue
{
    int arr[]=new int[100];
    int lim,front,rear;
    Dequeue(int l)
    {
        lim=l;
        front=0;
        rear=0;
        arr=new int[lim];
    }

    void addrear(int val)
    {
        if(rear<lim-1)
            arr[++rear]=val;
        else
            System.out.print("\nOverflow from rear");
    }

    int popfront()
    {
        if(front!=rear)
            return arr[++front];
        else
            return -9999;
    }

    void addfront(int val)
    {
        if(front>0)
            arr[front--]=val;
        else
            System.out.print("\nOverflow from front");
    }

    int poprear()
    {
        if(front!=rear)
            return arr[rear--];
        else
            return -9999;
    }
}