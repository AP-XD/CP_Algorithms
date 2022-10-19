class Curved_S
{
    static void main(int l)
    {   int i,j,t=l/2+1,k=2*l-1,o1=l,m=2,m1=l-1,h=2;
        for(i=1;i<2*l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(i>=1 && i<=k/3)
                {
                    if(j==t){
                        t--;
                        System.out.print(j);
                    }  
                    else if(i>1 && j==(t+1)+m)
                    {
                        
                        m+=2;
                        System.out.print(j);
                    }      
                    else
                        System.out.print("  ");
                }
                else if (i>=l*3/2 && i<=k)
                {
                    if(j==o1){
                        System.out.print(j);
                        o1--;
                        m1-=2;  
                    } 
                    else if(i<k && j==o1-m1)
                    {

                        System.out.print(j);
                    }   
                    else
                        System.out.print("  ");
                }else{
                    if(i-l/2==j && j==h){
                        System.out.print(j);
                        h++;}
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}