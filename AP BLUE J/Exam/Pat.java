class Pat{
    public static void main(int ch){
        int i,j,k;
        switch(ch){
            case 1:
            for(i=1;i<=5;i++){
            
           for(j=i;j<=5;j++){
            k=j*j-1; 
            System.out.print(k+" ");
            }System.out.println();
        }
          break;
          case 2:
            for(i=9;i>=1;i-=2){
            
           for(j=i;j<=9;j+=2){
             
            System.out.print(j+" ");
            }System.out.println();
        }
           break;
          default:
          System.out.println("Wrong choice");
    }}}