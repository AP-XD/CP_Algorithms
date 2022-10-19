import java.util.*;
class Volume
{
    public static void Overload(int s)/**Overload() function definition*/
    {
        System.out.println("Volume of cube:"+(s*s*s));/**displaying the volume of cube*/
    }

    /**end of Overload()*/
    public static void Overload(int l,int b,int h)/**Overload() function definition*/
    {
        System.out.println("Volume of cuboid:"+(l*b*h));/**displaying the volume of cuboid*/
    }

    /**end of Overload()*/
    public static void Overload(double r)/**Overload() function definition*/
    {
        System.out.println("Volume of sphere:"+(4*Math.PI*r*r*r/3));/**displaying the volume of sphere*/
    }

    /**end of Overload()*/
    public static void main(String args[])/**main function definition*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of cube\nLength, breadth and height of cuboid\nRadius of sphere respectively");
        int s,l,b,h,c;/**variable declaration and initialization*/
        double r;
        s=sc.nextInt(); 
        l=sc.nextInt();
        b=sc.nextInt();
        h=sc.nextInt();
        r=sc.nextDouble();
        Overload(s);
        Overload(l,b,h);
        Overload(r);
    }
}
