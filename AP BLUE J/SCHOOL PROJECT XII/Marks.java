import java.util.*;
class Marks extends Student
{
    double tot,per;char gd;/**Instance variable declaration*/
    void readData()
    {
        super.getData();/**calling of super class method to accept data from user*/
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.print("Enter Total marks of "+super.name+" out of 500:");/**Displaying the message*/
            tot=sc.nextInt();/**Accepting total marks from user*/
        }while(tot<0 || tot>500);
    }

    void compute()
    {
        per=tot/500.0*100.0;/**calculating percentage*/
        if(per>=85)
            gd='A';
        else if(per>=60 && per<85)
            gd='B';
        else if(per>=40 && per<60)
            gd='C';
        else if(per<40)
            gd='D';
    }

    void showData()
    {
        super.display();/**calling of super class method to display other details*/
        System.out.print("\nTotal Marks out of 500:"+tot+"\nPercentage:"+per+"\nGrade:"+gd);/**Displaying the output*/
    }

    public static void main(String args[])/**main() declaration*/
    {
        Marks ob=new Marks();/**Object creation*/
        ob.readData();ob.compute();ob.showData();/**Function Calling*/
    }/**end of main()*/
}/**end of class Marks*/