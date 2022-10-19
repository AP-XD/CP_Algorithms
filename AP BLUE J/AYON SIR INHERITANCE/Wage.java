public class Wage extends Worker
{
    protected int hrs;
    protected double rate,wage;
    public Wage(String n,double b,int h,double r)
    {
        super(n,b);
        hrs=h;
        rate=r;        
    }
    public double overtime()
    {
        return (hrs*rate);
    }
    public void display()
    {
        System.out.println("Hours = "+hrs);
        System.out.println("Rate = "+rate);
        System.out.println("Wage = "+(overtime()+super.basic)); 
        super.display();
    }
    public static void main(String args[])
    {
        Wage obj=new Wage("A",10000.50,5,500);
        obj.display();
    }
}
