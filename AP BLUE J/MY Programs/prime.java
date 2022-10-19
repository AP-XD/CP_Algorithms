class prime{


    boolean isprime(int v){
        int c=0,i;
        for(i=1;i<=v;i++){
            if(v%i==0)
                c++;}
        if(c==2)
            return true;
        else
            return false;
    }

    void alltwinprime(int x){
        int d,i,r,cp;
        for(cp=10;cp<=x;cp++){
            i=cp;
            r=0;
            if(isprime(i)){
                while(i>0)
                {
                    d=i%10;
                    r=r*10+d;
                    i/=10;}
                if(isprime(r)){
                    System.out.print(cp+ "  ");}

            }
        }
    }
}

