class home5
{
    public static void line(int n){
        
        
             for(int i=n; i>=1; i--){
            for(int k=i*2-1;k<=n*2-1;k+=2){
                System.out.print(k);
            }
            System.out.println();
        }
    }}
