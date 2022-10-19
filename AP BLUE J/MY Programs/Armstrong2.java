class Armstrong2{
    int ams(int n){
        int cp=n,s=0,d;
        while(n>0){
            d=n%10;
            s=s+d*d*d;
            n/=10;
        }
        if(s==cp)
            return 1;
        else
            return 0;
    }}

    