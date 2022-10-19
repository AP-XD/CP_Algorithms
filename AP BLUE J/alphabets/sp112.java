class sp112
{
    static void main(int l)
    {int i,j,a=l,a1=l-1,k,j1,b=3;
        for(i=1;i<2*l;i++){
            for(j=1;j<=a;j++){
                System.out.print(j);
            }if(i>=l)
                a++;
            else
                a--;
            for(k=1;k<=b && i>=2 && i<2*l-1;k++){
                System.out.print(" "); }
            if(i>=l)
                b-=2;
            else if(i>=2 && i<=l)
                b+=2;
            if(i==1 || i==2*l-1)
                a1=l+1;
            else if(i==2)
                a1=l-1;
            for(j1=a1;j1>=1;j1--){
                System.out.print(j1);
            }
            if(i>=l)
                a1++;
            else
                a1--;    
            System.out.println();
        }}}