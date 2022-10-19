class Series
{
    public static void main(char ch,int n)/**main function definition*/
    {
        int i,t=0,s=0;/**variable declaration and initialization*/
        switch(ch)/**starting of switch block*/
        {
            case 'a':/**starting of case 'a'*/
            for(i=1;i<=n;i++){/**starting of for loop*/
                s=s+(i*i+1);/**calculation of sum of the series*/
            }/**end of for loop*/	
            System.out.println("Sum="+s);/**displaying the sum**/
            break;/**end of case 'a'*/
            case 'b':/**starting of case 'b'*/
            for(i=2;i<=500;i+=2){/**starting of for loop*/
                s=s+(int)Math.pow(-1,t)*i;/**calculation of sum of the series*/
                t++;/**increment of term t by 1*/
            }/**end of for loop*/
            System.out.println("Sum="+s);/**displaying the sum**/
            break;/**end of case 'b'*/
            default:/**starting of default */
            System.out.println("Wrong Choice");/**displaying the message*/
            /**end of default*/
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Series*/
