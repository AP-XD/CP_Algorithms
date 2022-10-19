class pat2{
    static void main(){
        int i,j,k=1,y=7,l=3,m=5,r=3,h=1,u=1;
        for(i=1;i<=7;i++){
            for(j=1,h=7;j<=7 ;j++,h--){
                if(j>=k && j<=y && i<=4)
                    System.out.print(i+" ");
                else if(j>=l && j<=m && i>4)
                    System.out.print(r+" ");
                else if(i>=2 && i<=6 && j>4)
                    System.out.print(h+" ");
                else
                    System.out.print(j+" ");
            }
            k++;
            if(i>4){
                l--;
                r--;
                m++;}
            y--;
            System.out.println();}}}
