class area extends shape_1
{
    area()
    {       
        put_data();
        int l=rec_area();
        double b=area_1();
    }
    int rec_area()
    {       
        int a=returnlength()*returnbreadth();
        return a;
    }

    double area_1()
    {
        double ra=3.15*returnradius()*returnradius();
        return ra;
    }

    void show()
    {       
        System.out.println("THE AREA OF THE RECTANGLE = "+rec_area());
        System.out.println("THE AREA OF THE CIRCLE = "+area_1());
    }

    public static void main()
    {
        area ob = new area();
        ob.show();
    }
}