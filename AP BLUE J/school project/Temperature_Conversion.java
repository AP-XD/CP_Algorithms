class Temperature_Conversion
{
    public static void main(String args[])/**main function definition*/
    {
        int C=100,K=0;double F=0.0;/**variable declaration and initialization*/
        F=(9*C)/5+32;/**calculation of Fahrenheit temperature*/
        K=C+273;/**calculation of Kelvin temperature*/
        System.out.println("Fahrenheit temperature="+F);/**displaying the Fahrenheit temperature*/
        System.out.println("Kelvin temperature="+K);/**displaying the Kelvin temperature*/
    }/**end of main method*/
}/**end of class*/
