//Implement the insert() and delete() operation in Circular Queue when front = -1 and rear = -1
import java.io.*;
public class CircularQue
{
       public static int front=-1,rear=-1,n=5;
       static int que[]=new int[n];
       public static void insert(int num)
       {
           if((rear==(n-1) && front==0) || ((rear+1)==front))
           {
               System.out.print("\nQUEUE Is FULL......");
               return ;
           }
           if(rear==(n-1))
                rear=0;
           else
                rear++;
           que[rear]=num;
           if(front==-1)
                front=0;
           display();
       }
       public static void delete()
       {
           int num=0;
           if(front==-1)
           {
               System.out.print("\nQUEUE Is EMPTY.....Add one Element then Deletion is possible...");
               return ;               
           }
           num=que[front];
           que[front]=0;
           if(front==rear)
                front=rear=-1;
           else
           {
                if(front==n-1)                
                    front=0;
                else
                    front++;
           }
           System.out.print("\n\t\t Element deleted --> "+num+"\n");
           display();
       }
       public static void display()
       {
           System.out.print("\nThe Elements of the Queue are:--> ");
           for(int i=0;i<n;i++)
               System.out.print(que[i]+"  ");
           System.out.println();
       }
       public static void main(String args[])throws IOException
       {
           int num=0,ch=0,ans=0;          
           BufferedReader br= new BufferedReader(new InputStreamReader(System.in));        
           do{
               System.out.print("\t\t\t MAIN MENU");
               System.out.print("\n\t\t\t ---- ----");
               System.out.print("\n\t Enter 1 for INSERT Elements into QUEUE");
               System.out.print("\n\t Enter 2 for DELETE Elements from QUEUE");
               System.out.print("\n\t Enter 3 for DISPLAY all Elements of QUEUE");
               System.out.print("\n\t Enter your choice: ");
               ch=Integer.parseInt(br.readLine());
               switch(ch)
               {
                   case 1:
                        System.out.print("\n\t\t Enter The value: ");
                        num=Integer.parseInt(br.readLine());
                        insert(num);
                        break;
                   case 2:
                        delete();                   
                        break;
                   case 3:
                        display();
                        break;
                   default:
                        System.out.print("\n\t\t Wrong Choice........Press 1/2/3");
               }
               System.out.print("\n\t\t Do u want to continue? (Press 0/1)");
               ans=Integer.parseInt(br.readLine());           
           }while(ans==1);
       }    
}