class auto2{

        boolean auto(int n){
            int sq=n*n,d1=0,d2=0;
            while(n>0){
                
                d1=n%10;
                d2=sq%10;
                if(d1!=d2)
                break;
                sq/=10;
                n/=10;}
                if(d1==d2)
                    return true;
                    else   
                    return false;
                }}