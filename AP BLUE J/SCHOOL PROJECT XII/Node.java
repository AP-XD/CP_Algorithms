class Node
{
    int data;
    Node link;
    /**Default Constructor */
    Node()
    {
        link = null;
        data = 0;
    }    

    /**Parameterized Constructor  */
    Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
}/**end of class Node*/