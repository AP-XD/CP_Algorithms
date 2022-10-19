import java.util.*;
class Student
{
    String name,DOB;int roll;/**Instance variable declaration*/
    void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name of Student: ");
        name=sc.nextLine();/**Accepting name from user*/
        System.out.print("Enter DOB(DD/MM/YYYY) of "+name+" :");
        DOB=sc.nextLine();/**Accepting DOB from user*/
        System.out.print("Enter Roll No. of "+name+" :");
        roll=sc.nextInt();/**Accepting Roll No. from user*/
    }

    void display()
    {
        System.out.print("Name:"+name+"\nDOB:"+DOB+"\nRoll No:"+roll);/**Displaying the output*/
    }
}/**end of class Student*/