import java.util.*;
class BookFair
{
    String Bname;/**class variable declaration and initialization*/
    double price,total;
    BookFair()/**default constructor*/
    {
        Bname="";
        price=0.0;
    }

    void Input()/**Input() function defintion*/
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of book  :");
        Bname=sc.nextLine();
        System.out.print("Enter Price of book :");
        price=sc.nextDouble();        
    }

    void calculate()/**calculate function defintion*/
    {
        double dis=0;/**variable declaration and initialization*/
        if(price<=1000)
            dis=0.02;
        else if(price>1000&&price<=3000)
            dis=0.1;
        else if(price>3000)
            dis=0.15;
        total=price-price*dis;    
    }

    void display()/**display function defintion*/
    {
        System.out.println("Name of Book    :"+Bname+"\nPrice of Book   :"+price+"\nPrice after of book discount    :"+total);/**displaying the message*/
    }

    public static void main(String args[])/**main function defintion*/
    {
        BookFair obj=new BookFair();/**object creation*/
        obj.Input();/**function calling through object*/
        obj.calculate();/**function calling through object*/
        obj.display();/**function calling through object*/
    }/**end of main()*/
}/**end of class BookFair*/
       