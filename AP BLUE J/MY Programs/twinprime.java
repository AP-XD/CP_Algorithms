class twinprime{

    void tprime(int m,int n){
        int c=0,i,cp=n,d,r=0;

        for(i=1;i<=m;i++){
            if(m%i==0)
                c++;}
        if(c==2)
        {while(n>0)
            {
                d=n%10;
                r=r*10+d;
                n/=10;}
            c=0;
            if(m==r){
                for(i=1;i<=cp;i++){
                    if(cp%i==0)
                        c++;}
                if(c==2)
                    System.out.print("the numbers are twp");
                else
                    System.out.print("the numbers are not twp");
            }else
                System.out.print("the numbers are not twp");

        }else
            System.out.print("the numbers are not twp");

    }}