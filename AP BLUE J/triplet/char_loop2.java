class char_loop2{
    public static void input(int l){
        
        for(int i=1;i<=l;i++){
          for(int j=i;j<=l;j++)
          {System.out.print((char)(64+j)+" ");
          }
          for(int k=1;k<=i-1;k++)
         { System.out.print((char)(64+k)+" ");
          
        }System.out.println();}}}