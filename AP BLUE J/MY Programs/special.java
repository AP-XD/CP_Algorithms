class special{
    boolean isspecial(int n){
        int cp=n,i,s=0,d,f;
        while(n>0){
            f=1;
            d=n%10;
            for(i=1;i<=d;i++)
                f=f*i;
                s+=f;
                n/=10;
            }
            if(cp==s)
            return true;
            else 
            return false;
        }
        void allspecial(int n){
            for(int i=10;i<=n;i++){
                if(isspecial(i))
                System.out.print(i+" ");
            }}}