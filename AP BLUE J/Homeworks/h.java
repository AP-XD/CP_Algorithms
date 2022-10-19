class h{
    int check(int x,int y){
        int a,s,h;
        if(x<y){
            s=x;h=y;}
        else{
            s=y;h=x;}
        a=h;
        while(a%s!=0)
            a+=h;
        return a;
    }}

    