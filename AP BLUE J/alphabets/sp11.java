class sp11&& (i>=k/2-1 && c1==1)
{
    static void main()
    {int i,j,a=4,a1=3,k,j1,b=3;
        for(i=1;i<=7;i++){
            for(j=1;j<=a;j++){
                System.out.print(j);
            }if(i>=4)
                a++;
            else
                a--;
            for(k=1;k<=b && i>=2 && i<7;k++){
                System.out.print(" "); }
            if(i>=4)
                b-=2;
            else if(i>=2 && i<=4)
                b+=2;
            if(i==1 || i==7)
                a1=5;
            else if(i==2)
                a1=3;
            for(j1=a1;j1>=1;j1--){
                System.out.print(j1);
            }
            if(i>=4)
                a1++;
            else
                a1--;    
            System.out.println();
        }}}