import java.util.*;
class Taximeter 
{
    int taxi_no,km;
    String name="";/**variable declaration and initialization*/
    void input()/**input()  function definition*/ 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of passenger, taxi number and kilometre travelled respectively");
        name=sc.nextLine();
        taxi_no=sc.nextInt();       
        km=sc.nextInt();     
    }

    /**end of input()*/
    int calculate(int km)/**calculate() definition*/ 
    {
        int a;
        if(km<=1)/**starting of if-else-if statement*/
            a=km*25;
        else if(km>1 && km<=6)
            a=1*25+(km-1)*10;
        else if(km>6 && km<=12)
            a=1*25+5*10+(km-6)*15;
        else if(km>12 && km<=18)
            a=1*25+5*10+6*15+(km-12)*20;
        else
            a=1*25+5*10+6*15+6*20+(km-18)*25;
        /**end of if-else-if statement*/  
        return a;
    }

    /**end of calculate()*/
    void display()/**display() function definition*/ 
    {
        int amt=calculate(km);/**Call by value*/ 
        System.out.println("Taxi Number\tName\t\tKilometer travelled\tBill Amount");/**displaying the heading*/
        System.out.println(taxi_no+"\t\t"+name+"\t\t"+km+"\t\t"+amt);/**displaying the results under each heading*/
    }

    /**end of display()*/
    public static void main(String args[])/**main function definition*/
    {
        Taximeter ob=new Taximeter();/**object creation*/
        ob.input();/**function calling through object*/ 
        ob.display();/**function calling through object*/ 
    }/**end of main()*/
}/**end of class Taximeter*/
