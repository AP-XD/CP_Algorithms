import java.io.*;
class Insert_Node_End2
{
    Node start,ptr,nptr;//Object creation of Node class
    int num;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Insert_Node_End2()
    {
        start=null;  //Head Creation         
    }    
    public static void main(String args[])throws IOException
    {
        Insert_Node_End obj = new Insert_Node_End();
        obj.create_First_Node();
        obj.creation_Begin();        
        obj.display();
        obj.Insert_End();
        obj.display();
    } 
    public void create_First_Node()throws IOException
    {       
        System.out.println("Creation of 1st Node: ");
        System.out.println("Enter a number: ");
        num=Integer.parseInt(br.readLine());
        nptr= new Node(num,null);//Node Creation
        start=nptr; //Head Node points to Node 1
        ptr=nptr;   //Another reference points to Node 1
    }
    public void creation_Begin()throws IOException
    {        
        while(true)
        {
            System.out.println("Creation of Node from BEGINNING.....(Enter -999 to stop creation) : ");
            System.out.println("Enter a number: ");
            num=Integer.parseInt(br.readLine());
            if(num == -999)
                break;
            nptr=new Node(num,null);//Node Creation
            start=nptr;//Head Node points to Node 1
            nptr.link=ptr;//New Node points to Node 1
            ptr=nptr;//Another Node points to Node 1
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
    public void Insert_End()throws IOException
    {
        System.out.println("\nInsert Node at End: ");
        System.out.println("Enter a Number: ");
        num=Integer.parseInt(br.readLine());
        nptr=new Node(num,null);//Node Creation
                   
        ptr.link=nptr;//Last existing Node points to new Node
        ptr=nptr;//The reference is now points to new Node
    }
    
}