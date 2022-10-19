class pat27{
    static void main(String s){
        int w=s.length();
        int i,j,k=1,y=w*2-1,l=w-1,m=w+1,r=w-1,h=1,u=1;
        for(i=1;i<=w*2-1;i++){
            for(j=1,h=w*2-1;j<=w*2-1 ;j++,h--){
                if(j>=k && j<=y && i<=w)
                    System.out.print(s.charAt(i-1)+" ");
                else if(j>=l && j<=m && i>w)
                    System.out.print(s.charAt(r-1)+" ");
                else if(i>=2 && i<=w*2-2 && j>w)
                    System.out.print(s.charAt(h-1)+" ");
                else
                    System.out.print(s.charAt(j-1)+" ");
            }
            k++;
            if(i>w){
                l--;
                r--;
                m++;}
            y--;
            System.out.println();}}}
