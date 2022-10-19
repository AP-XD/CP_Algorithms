abstract class ACC
{   int ac_no;
    double p,r,t;
    ACC(int a, double p, double r, double t)
    {   ac_no=a; this.p=p; this.r=r; this.t=t;
    }
    void display()
    {   System.out.println(ac_no+" "+p+" "+r+" "+t);
    }
    abstract void calculate();
}
class SIMPLE extends ACC
{   double si;
    SIMPLE(int a, double p, double r, double t)
    {   super(a,p,r,t);
        si=0;
    }
    void display()
    {   super.display();
        System.out.println(si);
    }
    void calculate()
    {   si=p*r*t/100;
    }
}//class SIMPLE
class COMPOUND extends ACC
{   double ci;
    COMPOUND(int a, double p, double r, double t)
    {   super(a,p,r,t);
        ci=0;
    }
    void display()
    {   super.display();
        System.out.println(ci);
    }
    void calculate()
    {   ci=p*(Math.pow(1+r/100,t))-p;
    }
}//class COMPOUND
public class InheritanceQ1
{   public static void main()
    {   SIMPLE obj1=new SIMPLE(101,1000,10,5);
        obj1.calculate();
        obj1.display();
        COMPOUND obj2=new COMPOUND(101,1000,10,5);
        obj2.calculate();
        obj2.display();
    }
}
    