class test2{
    public static void t(double n)
    {
        double d=Math.floor(n);
        double c=Math.rint(n);
        double a=Math.ceil(n);
        double b=Math.round(n);
        System.out.println("n="+n);
        System.out.println("rint="+c);
        System.out.println("floor="+d);
        System.out.println("ceil="+a);
        System.out.println("round="+b);
        double f=Math.rint(7.50);
        System.out.println(f);
    }
}