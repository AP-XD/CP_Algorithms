class Interchange
{
    public static void main(String args[])/**main function definition*/
    {
        int a=10,b=15;/**variable declaration and initialization*/
        System.out.println("Before Swapping:");
        System.out.println(" A="+a+" and B="+b);/**displaying the value of a and b before swapping*/
        a=a*b;
        b=a/b;
        a=a/b;/**Swapping without third variable and +,- operator*/
        System.out.println("After Swapping:");
        System.out.println(" A="+a+" and B="+b);/**displaying the value of a and b after swapping*/
    }/**end of main method*/
}/**end of class*/
