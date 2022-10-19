class Max_Min
{
    public static void main(String args[])/**main function definition*/
    {
        int a=10,b=5,c=15,max=0,min=0;/**variable declaration and initialization*/
        max=Math.max(Math.max(a,b),c);/**calculation of maximum value of 3 numbers using Math function*/
        min=Math.min(Math.min(a,b),c);/**calculation of minimum value of 3 numbers using Math function*/
        System.out.println("The maximum of "+a+" and "+b+" and "+c+" is="+max);/**displaying the maximum value among three numbers*/
        System.out.println("The minimum of "+a+" and "+b+" and "+c+" is="+min);/**displaying the minimum value among three numbers*/
    }/**end of main method*/
}/**end of class*/
