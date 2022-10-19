class pat{
    public static void main(int n){
        int i,j,k,l,m;
        for (i=1;i<=n;i++){
            for (m=n-1;m>=i;m--)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print(k);
            for(l=i-1;l>=1;l--)
                System.out.print(l);
            System.out.println();}
        for(i=n-1;i>=1;i--){
            for(m=i;m<=n-1;m++)
                System.out.print(" ");
            for(k=1;k<=i;k++)
                System.out.print(k);
            for(l=i-1;l>=1;l--)
                System.out.print(l);
             System.out.println();}
    }
}

                