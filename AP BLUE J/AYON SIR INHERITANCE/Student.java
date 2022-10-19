class Student
{
    String name,DOB;
    int roll;
    void getData(String n,String d,int r)
    {
        name=n;
        DOB=d;
        roll=r;
    }

    void display()
    {
        System.out.println("Name: "+name+"\nDate of Birth: "+DOB+"\nRoll no.:"+roll);
    }
}