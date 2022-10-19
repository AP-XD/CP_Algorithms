import java.io.*;
class Insert_Node_Begin
{
    Node start,ptr,nptr; //Object creation of Node class
    int num;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Insert_Node_Begin()
    {
        start=null;    //Head Creation    
    }    

    public static void main(String args[])throws IOException
    {
        Insert_Node_Begin obj = new Insert_Node_Begin();
        obj.create_First_Node();
        obj.creation_End();        
        obj.display();
        obj.Insert_Begin();
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
            ptr.link=nptr;//Node 1 points to new Node
            ptr=nptr;//Another reterence points to new Node
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

    public void Insert_Begin()throws IOException
    {
        ptr=start;  //A reference point to head Node
        System.out.println("\nInsert Node at Beginning: ");
        System.out.println("Enter a Number: ");
        num=Integer.parseInt(br.readLine());
        nptr=new Node(num,null);//Node Creation
        start=nptr;//Head Node points to new Node 
        nptr.link=ptr;//New Node points to previous Node 1
        ptr=nptr;//Another Node points to current Node 1
    }
}