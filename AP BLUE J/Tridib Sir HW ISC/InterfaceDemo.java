class InterfaceDemo{
    public static void main(String args[]){
        Circle c = new Circle(2.5);
        System.out.println("Area of circle: " + c.area());
        Rectangle r = new Rectangle(5.0, 2.5);
        System.out.println("Area of rectangle: " + r.area());
    }
}