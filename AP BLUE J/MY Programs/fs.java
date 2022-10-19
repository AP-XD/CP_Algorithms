class fs{
    long fact (int a){
        long f=1;
        int i;
        for(i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    void series(int n){
        int i;
         double s=0;
        for(i=1;i<=n;i++){
            s+=1.0/fact(i);
        }
        System.out.print("Sum of Series:"+s);
    }}

            
        