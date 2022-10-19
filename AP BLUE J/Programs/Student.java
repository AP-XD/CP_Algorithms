import java.util.*;
public class Student
{
    String n;
    int r;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student name ");
        n=sc.nextLine();
        System.out.println("Enter the roll number ");
        r=sc.nextInt();
    }
    void print()
    {
        System.out.println("Name = "+n);
        System.out.println("Roll number: "+r);
    }
}
        