import java.util.*;
class Date_check
{
    public static void main(String args[])/**main() declaration*/
    {
        Scanner sc=new Scanner(System.in);
        String i="";int v[]={31,28,31,30,31,30,31,31,30,31,30,31},d=0,m=0,y=0,k=0;/**Variable declaration and initialization*/
        do
        {
            System.out.println("Enter Date in (ddmmyyyy) format");
            i=sc.nextLine();/**Accepting the Date from User*/
        }while(i.length()!=8);
        d=Integer.parseInt(i.substring(0,2));/**Extracting the day from the date*/
        m=Integer.parseInt(i.substring(2,4));/**Extracting the month from the date*/
        y=Integer.parseInt(i.substring(4));/**Extracting the year from the date*/
        /**Checking whether the date is valid or not*/
        if(y>0 && (m>0 && m<=12) && d>0)
        {
            if(m==2)
            {
                if((y%100!=0 && y%4==0) || (y%400==0))
                    if(d<=(v[m-1]+1))
                        k=1;
            }
            else
            if(d<=(v[m-1]))
            k=1;
        }
        if(k==1)
        System.out.println(i+" is a valid date");
        else
        System.out.println(i+" is an invalid date");
    }/**end of main()*/
}/**end of Date_Check*/