import java.util.*;
public class Date
{
    public static void main(String args[])/**main() declaration*/
    {
        String day[]={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"},in;int month[]={31,28,31,30,31,30,31,31,30,31,30,31},f=0,m_odd[]={3,0,3,2,3,2,3,3,2,3,2,3},q=0,p=0,od=0,y1=0,total_od=0,i,v;/**Variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date in the format (DD MM YYYY):");
        in=sc.nextLine().trim();/**Accepting date from user*/
        int d=Integer.parseInt(in.substring(0,2)),m=Integer.parseInt(in.substring(3,5)),y=Integer.parseInt(in.substring(6));
        v=d;
        if((y%100!=0 && y%4==0) || (y%400==0))
        {
            month[1]+=1;
            m_odd[1]=1;
        }
        if(y>=0)
            if(m>=1 && m<=12)            
                if(d>=1 && d<=month[m-1])
                    f=1;
        if(f==0)
        {
            System.out.println("Invalid Date.......");
            return;
        }               
        y=y-1;             /**STARTING ODD DAY CALCULATION OF YEAR*/
        q=y-((y/100)*100);
        od+=q+q/4;
        do
        {
            if(y1==y)
                break;
            y1+=400;
        }while(y1<=y);
        p=y-(y1-400)-q;
        if(p==100)
            od+=5;
        else if(p==200)
            od+=3;
        else if(p==300)
            od+=1;
        od=od%7;
        total_od+=od;
        od=0;
        m=--m;        /**STARTING ODD DAY CALCULATION OF MONTH*/
        for(i=0;i<m;i++)
        {
            od+=m_odd[i];  
            v+=month[i];
        }
        od=od%7;
        total_od+=od;
        od=0;
        od+=(d%7);    /**STARTING ODD DAY CALCULATION OF DAY*/
        total_od+=od;
        total_od=total_od%7;
        System.out.println("The day value is:"+v+" days and the day is:"+day[total_od]);/**Displaying the output*/
    }/**end of main()*/
}/**end of Date*/