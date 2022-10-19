package Others;

class Any_Any{
    public static void main(String n,int cb,int tb)
    {int p=n.indexOf('.');
        String i=n.substring(0,p),f=n.substring(p+1);
        System.out.println("the converted number is"+icon(i,cb,tb)+"."+fcon(f,cb,tb));

    }
    static String icon(String in,int cb,int tb)
    {
        int i,j=0,dec=0,k=0,r1=0,r=0;
        char c;
        for(i=in.length()-1;i>=0;i--){
            c=in.charAt(i);
            if(c>='A' && c<='F')
                j=c-55;
            if(c>='0' && c<='9')
                j=c-48;
            dec+=j*(int)Math.pow(cb,k++);
        }r1=dec;String ans="";
        while(r1>0){
            r=r1%tb;
            if(r>9 && r<=16)
                ans=(char)(55+r)+ans;
            else
                ans=r+ans;
            r1=r1/tb;
        }
        return ans;
    }
    static String fcon(String in,int cb,int tb){
        int i,j=0,c1=0,k=0,r=0,f2=0;
        double dec=0,dec1=0,f=0,f1=0;
        char c;
        for(i=0;i<in.length();i++){
            c=in.charAt(i);
            if(c>='A' && c<='F')
                j=c-55;
            if(c>='0' && c<='9')
                j=c-48;
            dec+=j/Math.pow(cb,++k);
        }f=dec;String ans="";
        for(i=1;i<=5;i++)
        {
            f=f*tb;
            f1=(int)f;
            f2=(int)f1;
            f=f-f1;
            if(f1==0){
                ans+='0';continue;}
            while(f2>0){
                r=f2%tb;
                if(r>9 && r<=16)
                    ans+=(char)(55+r);
                else
                    ans+=r;
                f2/=tb;
            }
        }      
        return ans;
    }
}  