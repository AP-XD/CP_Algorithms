public class Perimeter
{
    public double a,b;
    public Perimeter(double x,double y)
    {
        a=x;
        b=y;
    }
    public double Calculate()
    {
        return(2*(a+b));
    }
    public void show()
    {
        Perimeter obj=new Perimeter(a,b);
        System.out.println("Length: "+a);
        System.out.println("breadth: "+b);
        System.out.println("Perimeter: "+ obj.Calculate());
    }
}