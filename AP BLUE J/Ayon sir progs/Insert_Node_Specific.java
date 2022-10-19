import java.io.*;
public class Insert_Node_Specific
{
    Node start,ptr,nptr;//Object creation of Node class
    int num;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Insert_Node_Specific()
    {
        start=null;   //Head Creation         
    }    
    public static void main(String args[])throws IOException
    {
        Insert_Node_Specific obj = new Insert_Node_Specific();
        obj.create_First_Node();
        obj.creation_End();        
        obj.display();
        obj.insert_After();
        obj.display();
        obj.insert_Before();
        obj.display();
        obj.insert_Middle();
        obj.display();
    } 
    public void create_First_Node()throws IOException
    {       
        System.out.println("Creation of 1st Node: ");
        System.out.println("Enter a number: ");
        num=Integer.parseInt(br.readLine());
        nptr= new Node(num,null);//Node Creation
        start=nptr; //Head Node point to Node 1
        ptr=nptr;   //Another Node point to Node 1
    }
    public void creation_End()throws IOException
    {        
        while(true)
        {
            System.out.println("Creation of Node from END.....(Enter -999 to stop creation) : ");
            System.out.println("Enter a number: ");
            num=Integer.parseInt(br.readLine());
            if(num == -999)
                break;
            nptr=new Node(num,null);//Node Creation
            ptr.link=nptr;//Node 1 point to new Node
            ptr=nptr;//Another Node ref point to new Node
        }
    }
    public void display()
    {
        System.out.println("\nThe nodes are as follows:");
        ptr=start;  //A reference points to head Node
        while(ptr!=null) //Loop continues untill the reference is null
        {
            System.out.print(ptr.data+"-->");//Display the data value of a Node
            ptr=ptr.link; //The reference is pointing now next Node          
        }
        System.out.print("NULL"); //Message shows the end point
    }
    public void insert_After()throws IOException
    {
        int pos=0,i;        
        System.out.println("\nInsert Node After the Specific Node: ");
        System.out.println("Enter a Number: ");
        num=Integer.parseInt(br.readLine());
        System.out.println("Enter a Node Position: ");
        pos=Integer.parseInt(br.readLine());
        ptr=start;  //A reference points to head Node
        for(i=1;i<pos;i++)//Loop continues to reach the position
        {
            ptr=ptr.link;  //The reference is pointing now next Node            
            if(ptr==null) //When the reference becomes null
            {
                System.out.println("\nThe size of the location exceeds the size of the linked list.....");                
                return;
            }
        }
        nptr=new Node(num,null); //Node Creation
        nptr.link=ptr.link; //new Node link points to the reference 
        ptr.link=nptr; //The reference is pointing the new Node
    }
    public void insert_Before()throws IOException
    {
        int pos=0,i;        
        System.out.println("\nInsert Node Before the Specific Node: ");
        System.out.println("Enter a Number: ");
        num=Integer.parseInt(br.readLine());
        System.out.println("Enter a Node Position: ");
        pos=Integer.parseInt(br.readLine());
        ptr=start;  //A reference points to head Node
        if(pos==1)
        {
            nptr= new Node(num,null);//Node Creation
            start=nptr;//Head Node points to new Node
            nptr.link=ptr; //New Node points to previous Node 
            ptr=nptr;//The reference points to new Node 
            return;
        }        
        for(i=1;i<pos-1;i++)
        {
            ptr=ptr.link;   //The reference is point now next Node             
            if(ptr==null || ptr.link==null) 
            {
                System.out.println("\nThe size of the location exceeds the size of the linked list.....");                
                return;
            }
        }
        nptr=new Node(num,null); //New Node creation
        nptr.link=ptr.link; //new Node link points to the reference 
        ptr.link=nptr;//The reference is pointing the new Node
    }
    public void insert_Middle()throws IOException
    {        
        int pos=0,i,count=0;
        System.out.println("\nInsert Node Middle(i.e. between the 1st and last node): ");
        System.out.println("\nEnter the Position:");
        pos=Integer.parseInt(br.readLine());
        System.out.println("Enter a number: ");
        num=Integer.parseInt(br.readLine());
        ptr=start;  //A reference points to head Node
        while(ptr!=null) //Loop continues untill the reference is null
        {
            ptr=ptr.link;  //The reference is pointing now next Node        
            count++; //Counting the Node
        }
        System.out.println("\nTotal Nodes is = "+count);
        ptr=start; //A reference points to head Node
        if(ptr==null)//When the reference becomes null
        {
             System.out.println("\nLinked List is EMPTY.............Insertion Not Possible....");
             return;
        }        
        else if(ptr!=null) //When the reference is not null
        {
            if(pos==1 || pos==count)
            {
                System.out.println("\nInsertion not possible.....");                
                return;
            }
            else
            {
                if(ptr.link!=null) //When the reference link is not null
                {
                    for(i=1;i<pos-1;i++)
                    {
                        ptr=ptr.link;   //The reference is pointing now next Node         
                        if(ptr==null || ptr.link==null) 
                        {
                            System.out.println("\nThe size of the location exceeds the size of the linked list.....");                
                            return;
                        }
                    }
                    nptr=new Node(num,null);//New Node creation 
                    nptr.link=ptr.link;//new Node link points to the reference
                    ptr.link=nptr;//The reference is pointing the new Node
                }                
            }
        }        
    }   
}
