class char_loop4{
    public static void input(int l){
        
        for(int i=0;i<l-2;i++){
          for(int j=l-1;j>i;j--)
          {System.out.print(" ");
          }System.out.print((char)(65+i));
          for(int j=1;j<(i*2);j++)
          System.out.print(" ");
          if(i>=1)
         { System.out.println((char)(65+i)+" ");
          
        }System.out.print("\n");}
    for(int i=l-2;i<=l;i++){
          for(int j=1;j<i;j++)
          {System.out.print(" ");
          }System.out.print((char)(65+i));
       
          if(i>=1)
         { System.out.println((char)(65+i)+" ");
          
        }System.out.print("\n");}}}
    