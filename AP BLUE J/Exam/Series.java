class Series{
    public static void main(int ch,int a,int n){
        int i,j,s2=0,v=0;
        double s=0.0;
        switch(ch){
            case 1:
            for(i=1;i<=n;i++){
                int p=1;
           for(j=1;j<=i;j++){
            p=p*j;
            
            }System.out.println("p="+p);
            System.out.println("j="+j);
            s+=(double)a/p;}
          System.out.println("Sum= "+s);
          break;
          case 2:
          for(i=2;i<=20;i+=2){
          s2+=Math.pow(-1,v)*i;
          v++;}
           System.out.println("Sum= "+s2);
           break;
          default:
          System.out.println("Wrong choice");
    }}}