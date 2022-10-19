class series{
    long factorial(int n){
        long i,f=1;
        for(i=1;i<=n;i++)
            f=f*i;
        return f;}

    void sumofseries(int x,int n){int i;double s=0;
        for(i=2;i<=n;i++){
            s+=x/factorial(i);
        }System.out.print("sum="+s);}}