class Series{
    int i;double s=0;
    void SumSeries(double x){
        for(i=1;i<=19;i+=3)
        {s+=x*Math.pow(-1,i+1)/i;
        }
        System.out.println("Sum of the series:"+s);
    }
    void SumSeries(){
        int p=1;
        for(s=0,i=1;i<=20;i++)
        {
            p*=i;
            s+=p;
        }
        System.out.println("Sum of the series:"+s);
    }
    public static void main(String args[]){
     Series ob=new Series();
     ob.SumSeries(5.0);
     ob.SumSeries();
    }}