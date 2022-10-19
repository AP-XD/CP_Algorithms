import java.util.*;
class Worker
{
    String Name; double Basic;/**Instance variable declaration*/
    Worker(String n, double b)/**parameterized constructor*/
    {
        Name = n;/**Instance variable initialization*/
        Basic = b;
    }

    void display()
    {
        System.out.println("Worker Name:"+Name+"\nBasic Pay:"+Basic);/**Displaying the output*/
    }
}/**end of class Worker*/