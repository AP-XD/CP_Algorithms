/**
 * The class CalendarProgram inputs a year, month and the weekday name
 * of the 1st day of that month and generates its calendar
 * @author : www.guideforschool.com
 * @Program Type : BlueJ Program - Java
 */
import java.util.*;
class CalendarProgram
{
    //Function to match the given month and return its maximum days
    String months[] = {"","January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
    int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    int m_odd[]={3,0,3,2,3,2,3,3,2,3,2,3};
    int m3;
    int firstDay(int d,int m,int y)
    {
        int q=0,od=0,y1=0,y2=0,total_od=0,i;
        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        {
            m_odd[1]=1;
            D[2]=29;
        }
        y=y-1;          //STARTING ODD DAY CALCULATION OF YEAR
        q=y-((y/100)*100);
        od+=q;
        q=q/4;
        od+=q;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        y1=400; 
        do
        {
            if(y1==y)
                break;
            y1+=400;
        }while(y1<=y);
        y1-=400;
        y2=y-y1;
        q=y2-(y-((y/100)*100));
        if(q==100)
            od+=5;
        else if(q==200)
            od+=3;
        else if(q==300)
            od+=1;
        else
            od+=0;        
        od=od%7;
        total_od+=od;
        od=0;
        m=--m;        //STARTING ODD DAY CALCULATION OF MONTH
        for(i=0;i<m;i++)        
            od=od+m_odd[i];        
        od=od%7;
        total_od+=od;
        od=0;
        od=od+(d%7);    //STARTING ODD DAY CALCULATION OF DAY
        total_od+=od;
        total_od=total_od%7;
        return total_od;
    }

    int findMaxDay(String mname, int y)
    {

        if((y%400==0) || ((y%100!=0)&&(y%4==0)))
        {
            D[2]=29;
        }
        int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(mname.equalsIgnoreCase(months[i]))
            {
                max = D[i];
                m3=i;//Saving maximum day of given month
            }
        }
        return max;
    }

    //Function for creating the calendar
    void fillCalendar(int max, int f, String mname, int y)
    {
        int A[][] = new int[6][7];
        int x = 1, z = f;

        for(int i=0;i<6;i++)
        {
            for(int j=f; j<7; j++)
            {
                if(x<=max)
                {
                    A[i][j] = x;
                    x++;
                }
            }
            f = 0;
        }

        for(int j=0; j<z; j++) //Adjustment to bring last (6th) row elements to first row 
        { A[0][j]=A[5][j]; } 
        printCalendar(A, mname, y); //Calling function to print the calendar 
    } 
    //Function for printing the calendar
    void printCalendar(int A[][], String mname, int y)
    { 
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t "+mname+" "+y); System.out.println("\t----------------------------------------------------"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT"); 
        System.out.println("\t----------------------------------------------------");
        for(int i = 0; i < 5; i++) { 
            for(int j = 0; j < 7; j++) { 
                if(A[i][j]!=0) System.out.print("\t "+A[i][j]);
                else System.out.print("\t "); 
            } 
            System.out.println("\n\t----------------------------------------------------");
        } 
    } 

    public static void main(String args[])
    { 
        CalendarProgram ob = new CalendarProgram(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int y = sc.nextInt(); 
        System.out.print("Enter the month name: ");
        String mname = sc.next();               
        int max = ob.findMaxDay(mname,y);
        int f =ob.firstDay(1,ob.m3,y); 
        System.out.print("The 1st day name of "+mname+":"+ob.days[f]+"& Calendar of "+mname+" "+y);
        ob.fillCalendar(max,f,mname,y); 
    } 
}