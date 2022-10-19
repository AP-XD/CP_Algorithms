import java.util.*;
class Linked_Queue
{
    Node front, rear;int size;/**Instance variable declaration*/
    /**Default Constructor*/
    Linked_Queue()
    {
        front = null;
        rear = null;
        size = 0;
    }    

    /**Function to insert an element to the queue */
    void insert(int data)
    {
        Node nptr = new Node(data, null);
        if (rear == null)
        {
            front=rear=nptr;
        }
        else
        {
            rear.link=nptr;//Last existing Node points to new Node
            rear=nptr;//The reference now points to new Node
        }
        size++ ;
        display();
    }    

    /**Function to remove front element from the queue*/
    void remove()
    {
        if (size==0)
        {
            System.out.println("Queue is already empty!No more elements to remove.");return;
        }
        Node ptr = front;
        front=ptr.link;        
        if (front == null)
            rear=null;
        size-- ;
        System.out.println("Removed Element="+ptr.data);
        display();
    }    

    /**Function to display the status of the queue*/
    void display()
    {
        System.out.println("Queue:");
        if (size==0)
        {
            System.out.println("Empty");
            return;
        }
        Node ptr = front;
        while (ptr != rear.link)
        {
            System.out.print(ptr.data+" ");/**Displaying queue*/
            ptr = ptr.link;//The reference is pointing now next Node
        }  
        System.out.println();
    }    

    public static void main(String[] args)/**main() declaration*/
    {
        Scanner sc = new Scanner(System.in); 
        Linked_Queue lq = new Linked_Queue();/** Creating object of class Linked_Queue */
        int ch;/**Variable declaration and initialization*/
        System.out.println("Linked Queue Operations\nPress 1 to Insert element\nPress 2 to Remove element\nPress 3 to Stop");
        while(true)
        {
            System.out.println("Enter Choice");
            ch = sc.nextInt();/**Accepting choice from user*/
            switch (ch)
            {
                case 1 : 
                System.out.println("Enter integer element to insert");
                lq.insert(sc.nextInt());
                break;                         
                case 2 : 
                lq.remove();
                break;                         
                case 3 : 
                return;
                default : 
                System.out.println("Wrong choice");
            }                
        } 
    }/**end of main()*/
}/**end of Linked_Queue*/