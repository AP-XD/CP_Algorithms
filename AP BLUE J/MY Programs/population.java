class population{
    float p,r;
    population(int a,int b){
        p=a;
        r=b;
    }
    void print(){
        for(int i=2001;i<=2007;i++){
            p=p*(1+r/100);
        System.out.println("The population in the year "+i+" is="+p);
    }}}
            