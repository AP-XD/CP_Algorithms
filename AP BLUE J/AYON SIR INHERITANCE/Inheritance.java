class Employee
{
    int empNo;
    String empName,empDesg;
    Employee()
    {
        empNo=0;
        empName=empDesg="";
    }
    Employee(int no,String name,String desg)
    {
        empNo=no;
        empName=name;
        empDesg=desg;
    }
    void display()
    {
        System.out.println("Employee number: "+empNo);
        System.out.println("Employee name: "+empName);
        System.out.println("Employee designation: "+empDesg);
    }
}
class Salary extends Employee
{
    float basic;
    Salary(int no,String name,String desg,float b)
    {
        super(no,name,desg);
        basic=b;
        calculate();
    }
    void calculate()
    {
        float DA=0.1F*basic;
        float HRA=0.15F*basic;
        float Salary=basic+DA+HRA;
        float PF=.08F*Salary;
        float NetSalary=Salary-PF;
        display();
        System.out.println("Net Salary of the employee: "+NetSalary);
    }    
}
class Inheritance
{
    public static void main(String args[])
    {
        Salary ob = new Salary(1,"Sutirtha","CEO",10000.0F);
    }
}
