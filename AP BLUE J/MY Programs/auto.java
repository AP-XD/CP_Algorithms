class auto{
    int square(int n){
        return n*n;}
        boolean isauto(int n){
            int sq=square(n),d1=0,d2=0;
            while(n>0){
                
                d1=n%10;
                d2=sq%10;
                if(d1!=d2)
                break;
                sq/=10;
                n/=10;}
                if(d1==d2)
                    return true;
                    else   
                    return false;
                }
         void allauto(int n){
            for(int i=1;i<=n;i++){
            if(isauto(i))
            System.out.println(i+" ");
        }}}