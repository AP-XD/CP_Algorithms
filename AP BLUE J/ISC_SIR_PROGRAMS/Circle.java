interface Abc
{
    static final double p=3.14;
    void sampleMethod(int y);
}

class Xyz implements Abc  
{
    public void cal()
    { double a = 32 * p;
        System.out.println("test= "+ a); 
    }

    public void sampleMethod(int y)   
    {    double a = 32 * p;
        System.out.println("test= "+ a);
        System.out.println("call= " +y);  
    }

    static void main() 
    { Xyz obj = new Xyz();
        obj.cal();
        obj.sampleMethod(20); 
    }
}

interface Shape
{
    double pi=3.142;
    double area( );
}

public class Circle implements Shape
{
    double radius;
    Circle(double r)
    { radius=r;
    }

    public double area()
    { double a= pi * radius * radius;
        return a;
    }

    void cal()
    {System.out.println(radius);
        System.out.println(pi);  
    }

    public static void main()
    { Circle obj=new Circle(2.5);
        obj.cal();  
        double x= obj.area();

        System.out.println(" Area of the Circle = " + x);
    }

}

class Rectangle implements Shape
{
    double length,breadth;
    Rectangle(double l,double b)
    { length=l;
        breadth=b;
    }

    public double area()
    { 
        double a= length * breadth;
        return a;
    }

    static void main()
    { Rectangle obj=new Rectangle(3.0,4.5);
        double x=obj.area();
        System.out.println("Area of Rectangle = " + x);
    }

}

class Test 
{
    public static void main()
    { 
        Circle obj=new Circle(2.5);
        Rectangle obj1=new Rectangle(3.0,2.5);
        Shape x=obj;
        double y=obj.area(); 
        System.out.println(y);
        Shape z=obj1;
        double p=obj1.area();
        System.out.println(p);
    }
}