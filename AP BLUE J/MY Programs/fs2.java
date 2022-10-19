class fs2{
    long fact (int m){
        long f=1;
        int i;
        for(i=1;i<=m;i++){
            f=f*i;
        }
        return f;
    }
    void series(int a,int n){
        int i;
         double s=1.0;
        for(i=1;i<n;i++){
            s+=Math.pow(a,i+1)/fact(i+1);
        }
        System.out.print("Sum of Series:"+s);
    }}

            
        