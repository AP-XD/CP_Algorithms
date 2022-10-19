import java.io.*;
class Employee
{
    public int no,no1,basic;
    public String name,dept;
    Employee()
    {
        no=0;
        no1=0;
        basic=0;
        name="";
        dept="";
    }
    void accept()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name");
        name=in.readLine();
        System.out.println("Enter employee no");
        no=Integer.parseInt(in.readLine());
        System.out.println("Enter department name");
        dept=in.readLine();
        System.out.println("Department no.");
        no1=Integer.parseInt(in.readLine());
        System.out.println("Enter basic");
        basic=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println(" name "+name);
        System.out.println(" employee no "+no);
        System.out.println("department name "+dept);
        System.out.println("department no "+no1);
        System.out.println("basic "+basic);
    }
    public static void main(String args[])throws IOException
    {
        Employee ob=new Employee();
        ob.accept();
        ob.display();
    }
}

    
        