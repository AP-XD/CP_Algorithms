class pat{
    static void main(){
         int i,j,k=1,y=7,l=3,m=5;
        for(i=1;i<=7;i++){
            for(j=1;j<=7;j++){
                if(j>=k && j<=y && i<=4)
                System.out.print(j+" ");
                else if(j>=l && j<=m && i>4)
                System.out.print(j+" ");
                else
                System.out.print("  ");
            }
            k++;
            if(i>4){
            l--;
            m++;}
            y--;
            System.out.println();}}}
                