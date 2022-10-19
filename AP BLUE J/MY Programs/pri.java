class pri{
    
    int prchk(int n){
        int c=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0)
                c++;}
        if(c==2)
            return 1;
        else
            return 0;
    }}
