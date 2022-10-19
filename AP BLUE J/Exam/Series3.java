class Series3{
    public static void main(int ch,int x,int n){
        int i,j=0,s2=0,v=0;
        double s=0.0;
        switch(ch){
            case 1:
            for(i=1;i<=n;i++){
                int p=1;
           for(j=1;j<=i;j++){
            p=p*j;
            
            }
            s+=Math.pow(x,i)/p;}
          System.out.println("Sum= "+s);
          break;
          case 2:
          for(i=2;i<=n*2;i+=2){
          j=j+i;
          s2+=j;
          }
           System.out.println("Sum= "+s2);
           break;
          default:
          System.out.println("Wrong choice");
    }}}