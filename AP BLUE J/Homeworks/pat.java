class pat{
    public static void main(String args[]){
        int i,j,k,l; 
        for(i=5;i>=2;i--){
            for(l=i;l>=3;l--)
                System.out.print("  ");
            for(j=i;j<=5;j++)
                System.out.print((char)(64+j)+" ");
            for(k=1;k<=5-i;k++)
                System.out.print((char)(69+k)+" ");
         System.out.println();}
}}
