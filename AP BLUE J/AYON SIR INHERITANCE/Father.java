import java.io.*;
class Father implements Age 
{
    int f_age;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    public void getData()
    {
        System.out.print("Father class Accessed");
        System.out.print("\n---------------------");
        System.out.print("\nEnter the Father's Age: ");
        try
        {
            f_age = Integer.parseInt(br.readLine());
        }
        catch(Exception e){};        
    }
    public int display()
    {
        return f_age;
    }
}

