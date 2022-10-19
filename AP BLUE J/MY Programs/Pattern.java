class Pattern
{
    public static void main(int ch)/**main function definition*/
    {
        int i,j;/**variable declaration and initialization*/
        switch(ch)/**starting of switch block*/
        {
            case 1:/**starting of case 'a'*/
            for(i=9;i>=1;i-=2){/**starting of for loop*/
                for(j=1;j<=i;j+=2){/**starting of for loop*/
                    System.out.print(j);/**displaying each element of the series*/
                }/**end of for loop*/
                System.out.println();
            }/**end of for loop*/
            break;
            case 2:
            for(i=1;i<=5;i++){/**starting of for loop*/
                for(j=1;j<=i;j++){/**starting of for loop*/
                    System.out.print(i);/**displaying each element of the series*/
                }/**end of for loop*/
                System.out.println();
            }/**end of for loop*/
            break;
            default:/**starting of default */
            System.out.println("Wrong Choice");/**displaying the message*/
            /**end of default*/
        }/**end of switch block*/
    }/**end of main method*/
}/**end of class Pattern*/
