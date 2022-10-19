class E_Bill
{
    public static void main(String n,int u)/**main function definition*/
    {
        double c;/**variable declaration and initialization*/
        if(u<=50)/**starting of if-else-if statement*/
            c=150+.75*u;
        else if (u>50 && u<=100)
            c=150+.75*50+1.25*(u-50);
        else if (u>100 && u<=250)
            c=150+.75*50+1.25*50+2.25*(u-100);
        else if(u>250 && u<=500)
            c=150+.75*50+1.25*50+2.25*150+3.5*(u-250);
        else
            c=150+.75*50+1.25*50+2.25*150+3.5*250+5.0*(u-500);
        /**end of if-else-if statement*/    
        System.out.println("Customer Name\t\tUnits Consumed\t\tCharge");/**displaying the heading*/
        System.out.println(n+"\t\t\t\t"+u+"\t\t\t\t\t"+c);/**displaying the results under each heading*/
    }/**end of main method*/
}/**end of class Marks*/

