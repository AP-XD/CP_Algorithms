class Armstrong_No
{
    public static void main(int i)/**main function definition*/
    {
        int d,s=0,cp=i;/**variable declaration and initialization*/
         while(i>0){/**starting of while loop*/
            d=i%10;/**extraction of last digit*/
            s+=d*d*d;/**calculation of sum of each digit's cube*/
            i/=10;/**removing the last digit of number*/
        }/**end of while loop*/
        if(s==cp)/**starting of if-else statement*/
            System.out.println("The number "+cp+" is an Armstrong Number");
            else
             System.out.println("The number "+cp+" is not an Armstrong Number");/**displaying that the  the number is not an Armstrong Number*/
        /**end of if-else statement*/
    }/**end of main method*/
}/**end of class Series*/