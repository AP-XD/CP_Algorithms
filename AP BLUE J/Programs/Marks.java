import java.util.*;
public class Marks extends Student
{
    int m1,m2,m3,s,avg;
    void read()
    {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks :");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
    }
    void calc()
    {
        s=m1+m2+m3;
        avg=s/3;
    }
    void display()
    {
        print();
        System.out.println("Sum = "+s);
        System.out.println("Average = "+avg);
    }
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        Marks ob = new Marks();
        ob.read();
        ob.calc();
        ob.display();
    }
}