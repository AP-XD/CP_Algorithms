import java.io.*;
public class ODD_DAY
{
    static int d,m,y;
    public static int day[]={ 31,28,31,30,31,30,31,31,30,31,30,31};
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a date in the format  ddmmyyyy :");
        String date=in.readLine();
        int d=Integer.parseInt(date.substring(0,2));
        int m=Integer.parseInt(date.substring(2,4));
        int y=Integer.parseInt(date.substring(4,8));
        int check= valid(d,m,y);
        if( check==1 )
        {
            System.out.println("VALID DATE.........");
            calculate_oddDay(d,m,y);
        }
        else
            System.out.println("INVALID DATE.......");
    }
    public static int valid(int d1,int m1,int y1)
    {
        int flag=0;
        int leapchk= isLeap(y1);
        if(leapchk==1)
            day[1]=day[1]+1;
        if(y1>=0)
        {
            if( m1>=1 && m1<=12 )
            {
                if(d1>=1 && d1<= day[m1-1])
                    flag=1;
                else
                    flag=0;
            }
        }
        else
            flag=0;
        return flag;
    }   
    public static int isLeap(int y)
    {
        int x=0;
        if((y%100!=0 && y%4==0) || (y%400==0))
            x=1;
        return x;
    }     
    public static void calculate_oddDay(int d,int m,int y)
    {
        int q=0,od=0,y1=0,y2=0,total_od=0,i;
        String day[]={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        int m_odd[]={3,0,3,2,3,2,3,3,2,3,2,3};
        if((y%100!=0 && y%4==0) || (y%400==0))
            m_odd[1]=1;
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
        System.out.println("Odd Day Year: "+od);
        od=0;
        m=--m;        //STARTING ODD DAY CALCULATION OF MONTH
        for(i=0;i<m;i++)        
            od=od+m_odd[i];        
        od=od%7;
        total_od+=od;
        System.out.println("Odd Day Month: "+od);
        od=0;
        od=od+(d%7);    //STARTING ODD DAY CALCULATION OF DAY
        total_od+=od;
        System.out.println("Odd Day Day: "+od);
        System.out.println("Total Odd Day: "+total_od);
        total_od=total_od%7;
        for(i=0;i<7;i++)
        {
            if(total_od==i)
            {
                System.out.println("The Day of the week is = "+day[i]);
                break;
            }
        }                
    }        
}
