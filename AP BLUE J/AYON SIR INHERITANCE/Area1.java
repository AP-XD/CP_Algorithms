public class Area1 extends Perimeter
{
    public double h,area;
    public Area1(double x,double y,double p)
    {
        super(x,y);
        h=p;
    }
    public void doarea()
    {
        area=(b*h);
    }
    public void show()
    {
        super.show();
        System.out.println("Height: "+h);
        System.out.println("Area: "+area);
    }
    public static void main(String args[])
    {
        Area1 ob=new Area1(5.0,2.0,1.0);
        ob.doarea();
        ob.show();
    }
}
        