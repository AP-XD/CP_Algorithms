class pat4{
    public static void main(){
        int i,j,k,m;
      for(i=1;i<=5;i++)
      {
          for(m=4;m>=i;m--)          
          System.out.print("  ");
          for(j=i;j<=i*2-1;j++)
              System.out.print(j+" ");
          for(k=(i-1)*2;k>=i;k--)
              System.out.print(k+" ");   
          System.out.println();
        }
    }
}             