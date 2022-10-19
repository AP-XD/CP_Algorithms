//main class to run the program
import java.io.*;
public class callSaddlePoint
{
    public static void main(String args[])//main method
    {
        saddlePoint ob = new saddlePoint();//reference of the working class is created
        try
        {
            ob.input();//possible statement where IOException can be caught
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            ob.compute();         // calling of the exception free method
        }
    }//end of main()
}//end of class

