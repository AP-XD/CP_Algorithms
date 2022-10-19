class Unique_No{
    public static void main(String args[])/**main function definition*/
    {
        int i,cp,cp2,d1,d2,c=0;/**variable declaration and initialization*/
        System.out.print("Unique Numbers between 100 to 200 are:");
        for(i=100;i<=200;i++)/**starting of for loop*/
        {
            cp=i;
            while(cp>0)/**starting of while loop*/
            {
                d1=cp%10;/**extraction of last digit*/
                cp2=i;
                c=0;
                while(cp2>0)/**starting of while loop*/
                {
                    d2=cp2%10;/**extraction of last digit*/
                    if(d2==d1)
                        c++;
                    cp2/=10;/**removing the last digit of number*/
                }/**end of while loop*/
                if(c>1)
                {/**starting of if-else statement*/
                    break;
                } /**end of if-else statement*/
                cp/=10;/**removing the last digit of number*/
            }/**end of while loop*/
            if(c<=1)
                System.out.print(i+"  ");
        }/**end of for loop*/
    }/**end of main*/
}/**end of class Unique_No*/

