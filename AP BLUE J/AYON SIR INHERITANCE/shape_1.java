import java.util.*;
public class shape_1
{
    Scanner sc = new Scanner(System.in);
    private int length,breadth;
    private float r;
    public void get_data()
    {
        System.out.println("Enter the length = ");
        length = sc.nextInt();
        System.out.println("Enter the breadth = ");
        breadth = sc.nextInt();
        System.out.println("Enter the radius of the circle = ");
        r = sc.nextInt();
    }

    public void put_data()
    {        
        get_data();
        System.out.println("length = "+length);     
        System.out.println("breadth = "+breadth);
        System.out.println("radius= "+r); 
    }

    int returnlength()
    {
        return length;
    }

    int returnbreadth()
    {
        return breadth;
    }      

    float returnradius()
    {
        return r;
    }
}