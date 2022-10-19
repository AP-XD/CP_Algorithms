class pat21{
    static void main(int w){
        int i,j,k=1,y=w*2-1,l=w-1,m=w+1,r=w-1,h=1,u=1;
        for(i=1;i<=w*2-1;i++){
            for(j=1,h=w*2-1;j<=w*2-1 ;j++,h--){
                if(j>=k && j<=y && i<=w)
                    System.out.print(i+" ");
                else if(j>=l && j<=m && i>w)
                    System.out.print(r+" ");
                else if(i>=2 && i<=w*2-2 && j>w)
                    System.out.print(h+" ");
                else
                    System.out.print(j+" ");
            }
            k++;
            if(i>w){
                l--;
                r--;
                m++;}
            y--;
            System.out.println();}}}
