class Area_Perimeter
{
    public static void main(String args[])/**main function definition*/
    {
        int lr=5,br=10,ss=15,set=20,pet=0,ar=0,pr=0,as=0,ps=0;double aet=0.0;/**variable declaration and initialization*/
        ar=lr*br;/**calculation of area of rectangle*/
        pr=2*(lr+br);/**calculation of perimeter of rectangle*/
        as=ss*ss;/**calculation of area of square*/
        ps=4*ss;/**calculation of perimeter of square*/
        aet=(Math.sqrt(3)/4)*set*set;/**calculation of area of equilateral triangle*/
        pet=3*set;/**calculation of perimeter of equilateral triangle*/
        System.out.println("The area of rectangle whose length is "+lr+" and breadth is "+br+" is="+ar);/**displaying the area of rectangle*/
        System.out.println("The perimeter of rectangle whose length is "+lr+" and breadth is "+br+" is="+pr);/**displaying the perimeter of rectangle*/
        System.out.println("The area of square whose side is "+ss+" is="+as);/**displaying the area of square*/
        System.out.println("The perimeter of square whose side is "+ss+" is="+ps);/**displaying the perimeter of square*/
        System.out.println("The area of equilateral triangle whose side is "+set+" is="+aet);/**displaying the area of equilateral triangle*/
        System.out.println("The perimeter of equilateral triangle whose side is "+set+" is="+pet);/**displaying the perimeter of equilateral triangle*/       
    }/**end of main method*/
}/**end of class*/
