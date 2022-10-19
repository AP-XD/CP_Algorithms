class pat23{
    static void main(){
        int i,j,k=1,y=7,l=3,m=5,r=3,h=1,u=1;
        String s="ARKA";
        for(i=1;i<=7;i++){
            for(j=1,h=7;j<=7 ;j++,h--){
                if(j>=k && j<=y && i<=4)
                    System.out.print(s.charAt(i-1)+" ");
                else if(j>=l && j<=m && i>4)
                    System.out.print((s.charAt(r-1)+" "));
                else if(i>=2 && i<=6 && j>4)
                    System.out.print((s.charAt(h-1)+" "));
                else
                    System.out.print((s.charAt(j-1)+" "));
            }
            k++;
            if(i>4){
                l--;
                r--;
                m++;}
            y--;
            System.out.println();}}}
