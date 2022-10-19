class happy{
    public static void main(String w){

        String s2="";
        int k,k2,s=0,d,c;

        for(int i=0;i<w.length();i++){
            c=w.charAt(i)-64;

            s2+=c;}

        k2=Integer.parseInt(s2); 

        k=k2;
        while(k>9){

            while(k>0){
                d=k%10;
                s+=d*d;
                k/=10;

            }

            k=s;

            s=0;}
        if(k==1)
            System.out.println("A Happy word");
        else
            System.out.println("Not A Happy word");
    }}