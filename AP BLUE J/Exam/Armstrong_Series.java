class Armstrong_Series{
    public static void main(int l,int u){
        int i;
        for(i=l;i<=u;i++){
            int cp=i,d,s=0;
        while(cp>0){
            d=cp%10;
            s=s+d*d*d;
            cp/=10;
        }
        if(i==s)
        System.out.println("The no. "+i+" is an Armstrong number");
           }}}