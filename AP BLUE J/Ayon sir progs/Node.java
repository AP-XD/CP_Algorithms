public class Node
{  
    int data;
    Node link;//Instance variable
    Node()  //Default Constructor
    {
        data=0;
        link=null;
    }
    Node(int d,Node m)//Parametrised Constructor
    {
        data=d;
        link=m;
    }
}
