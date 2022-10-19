class Armstrong_No2
{
    public static void main()/**main function definition*/
    {
        int d,s=0,i,j;/**variable declaration and initialization*/
        for(j=100;j<=999;j++){
            i=j;s=0;
               while(i>0){/**starting of while loop*/
            d=i%10;/**extraction of last digit*/
            s+=d*d*d;/**calculation of sum of each digit's cube*/
            i/=10;/**removing the last digit of number*/
        }/**end of while loop*/
        if(s==j)/**starting of if-else statement*/
            System.out.println("The number "+j+" an Armstrong Number");
        }
        /**end of if-else statement*/
    }/**end of main method*/
}/**end of class Series*/