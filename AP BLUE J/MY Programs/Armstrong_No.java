class Armstrong_No
{
    public static void main(int n)/**main function definition*/
    {
        int d,s=0,cp=n;/**variable declaration and initialization*/
        while(n>0){/**starting of while loop*/
            d=n%10;/**extraction of last digit*/
            s+=d*d*d;/**calculation of sum of each digit's cube*/
            n/=10;/**removing the last digit of number*/
        }/**end of while loop*/
        if(s==cp)
            System.out.println("The number "+cp+" is an Armstrong Number");/**displaying that the  the number is an Armstrong Number*/
        else
            System.out.println("The number "+cp+" is not an Armstrong Number");/**displaying that the  the number is not an Armstrong Number*/
    }/**end of main method*/
}/**end of class Series*/
