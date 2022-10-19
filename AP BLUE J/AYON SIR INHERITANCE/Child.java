import java.io.*;
class Child implements Age
{
    int c_age;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public void getData()
    {
        System.out.print("\nChild class Accessed");
        System.out.print("\n---------------------");
        System.out.print("\nEnter the Child's Age: ");
        try
        {
            c_age = Integer.parseInt(br.readLine());
        }
        catch(Exception e){};         
    }
    public int display()
    {
        return c_age;
    }
}
