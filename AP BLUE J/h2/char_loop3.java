class char_loop3{
    public static void input(int l){
        
        for(int i=1;i<=l;i++){
          for(int j=1;j<=l-i;j++)
          {System.out.print((char)(64+j)+" ");
          }
          for(int k=l-i;k<=l-1;k++)
         { System.out.print((char)(86+k)+" ");
          
        }System.out.println();}}}