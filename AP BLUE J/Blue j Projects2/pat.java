class pat{
    public static void line(int n){
        int z=1,l=1;
        for(int i=1;i<n;i++){
        for(int j=n-1;j<i;j++){
            System.out.print("");}
        for(int k=1;k<=i;k++)
        {System.out.print(Math.abs(k-l));
        }
        l++;
        z+=2;
        System.out.println();}}}
    