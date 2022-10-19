class auto{
    public static void main(int n){
        int sq=n*n,d=0,d1=0;
        while(n>0){
            d=n%10;
            d1=sq%10;
            n/=10;
            sq/=10;
            if(d!=d1)
            break;}
            if(d==d1)
            System.out.println("A");
            else
           System.out.println("nA");   
        }
    }