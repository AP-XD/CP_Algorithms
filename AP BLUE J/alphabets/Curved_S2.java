/**Enter input >2*/
class Curved_S2
{
    static void main(int l)
    {   int i,j,t=l/2+1,k=2*l,k1=0,o1=l,m=2,m1=l-1,h=2,k2=0;
        for(i=1;i<=2*l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(i>=1 && i<=l/2+1)
                {
                    if(j==t && i!=l/2+2){

                        System.out.print(j);

                    }  
                    else if(i>1 && j==(t+1)-m )
                    {

                        System.out.print(j);
                        t++;
                        m+=2;
                    }      
                    else 
                        System.out.print("  ");
                }
                else if (i>l*3/2 && i<=k)
                {
                    if(j==o1  ){
                        System.out.print(j);
                        o1--;
                        m1-=2;
                        
                    } 
                    else if(j==o1-m1 && i!=l*2)
                    {
                        System.out.print(j);
                        k2++; 
                    }   
                    else
                        System.out.print("  ");
                }else{
                    if(j==h && k1==0){
                        System.out.print(j);
                        h++;
                        k1++;}

                    else
                        System.out.print("  ");
                }
            }k1=0;k2=0;
            
            System.out.println();
        }
    }
}