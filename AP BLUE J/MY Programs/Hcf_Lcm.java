class Hcf_Lcm{
    static void hlcm(int a,int b){
        double lcm;
        int min=(a<b)?a:b,hcf=0,i;
        for(i=1;i<=min;i++){
            if(a%i==0 && b%i==0)
            hcf=i;
        }
        lcm=(double)a*b/hcf;
        System.out.println("hcf:"+hcf);
        System.out.print("lcm="+lcm);
    }}