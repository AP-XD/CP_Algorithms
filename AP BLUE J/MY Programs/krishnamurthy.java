class krishnamurthy{
    int factorial(int n){
        int i,f=1;
        for(i=1;i<=n;i++)
                f=f*i;
                return f;}
     int sumoffactorial(int n){
         int s=0,d;
         while(n>0){
             
             d=n%10;
             s+=factorial(d);
             n/=10;}
             return s;}
     boolean iskrishnamurthy(int n){
        
            if(n==sumoffactorial(n))
            return true;
            else 
            return false;
        }
        void allkrishnamurthy(int n){
            for(int i=10;i<=n;i++){
                if(iskrishnamurthy(i))
                System.out.print(i+" ");
            }}}