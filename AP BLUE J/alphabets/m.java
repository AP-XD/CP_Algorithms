class m
{
    static void main(int k)
    {int i,j,h=2*k,g=h,y=1,c=2,c2=0;
        for(i=1;i<=k;i++,g-=2,y+=2){
            for(j=1;j<=h;j++){
                if(j==1 || j==h )
                    System.out.print(c);
                if((j==y+1 || j==g-1)  && i<=k/2  )
                    System.out.print(c);
                else 
                {if(i>k/2 && j==h/2) 
                    System.out.print("");
                    else
                    System.out.print("  ");
                    c2++;
                }
            }
            
            c2=0;
            System.out.println();
        }}}