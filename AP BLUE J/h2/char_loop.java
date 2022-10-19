class char_loop{
    public static void input(int l){
        char q='A';
        for(int i=1;i<=l;i++){
          for(int j=1;j<=l-i;j++)
          System.out.print(" ");
          for(int k=1;k<=i;k++)
         { System.out.print(q+" ");
          q++;
        }System.out.println();}}}