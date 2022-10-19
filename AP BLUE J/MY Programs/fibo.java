class fibo{
    boolean isfibo(int n){
        int a=0,b=1,c=a+b,k=0;

        if(n==a || n==b)
            return true;
        else {
            while(n>=c){
                c=a+b;
                if(n==c){
                    k++;
                    return true;
                    }
                a=b;
                b=c;
            }}
            if(k!=1)
                return false;
             else 
                return true;    
                
        }

    void allprimefibo(int n){
        int i,j,c;
        for(i=1;i<=n;i++){
            c=0;
            if(isfibo(i))
            {for(j=1;j<=i;j++){
                    if(i%j==0)
                        c++;
                }if(c==2)
                    System.out.print(i+" ");
                }
        }
    }
}

            