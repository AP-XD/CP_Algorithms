class w_with_numbers
{
    static void main(int k)
    {int i,j,h=3*k,l=2*k,g=k;
        for(i=1;i<=k;i++,h--,l--,g++){
            for(j=1;j<=h;j++){
                if(i==j || j==h)
                System.out.print(j);
               if((j==l || j==g)  && i>=k/2+1 && k%2==0)
                System.out.print(j);
                else if((j==l || j==g)  && i>=k/2+2 && k%2!=0)
                System.out.print(j);
                else
                    System.out.print("  ");
                   
            }
            System.out.println();
        }}}