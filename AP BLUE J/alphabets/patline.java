class patline{
    static void main(int p){
         int i,j,k=1,y=p,l=p/2,m=p/2+2;
        for(i=1;i<=p;i++){
            for(j=1;j<=p;j++){
                if(j>=k && j<=y && i<=p/2+1)
                System.out.print(j+" ");
                else if(j>=l && j<=m && i>p/2+1)
                System.out.print(j+" ");
                else
                System.out.print("  ");
            }
            k++;
            if(i>p/2+1){
            l--;
            m++;}
            y--;
            System.out.println();}}}
                