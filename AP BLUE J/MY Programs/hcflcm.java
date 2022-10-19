class hcflcm{
    int a,b;
    hcflcm(int x,int y){
        a=x;
        b=y;
    }
    void calculate(){
        int min,hcf=1,lcm;
        min=(a<b)?a:b;
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        lcm=(a*b)/hcf;
        System.out.print("HCF="+hcf+"\nLCM="+lcm);
    }}
        