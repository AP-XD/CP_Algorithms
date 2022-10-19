package Others;

class BIN_ADD{
    public static void main(String a,String b){
        int i,l1=a.length(),l2=b.length(),cr=0,m=0,n=0,c=0,z=0;
        String ans="";
        for(i=0;i<=Math.max(l1,l2);i++){
            c++;
            if(c>l2)
                b='0'+b;
            if(c>l1)
                a='0'+a;
        }
        for (i=a.length()-1;i>=0;i--)
        {
            m=a.charAt(i)-48;
            n=b.charAt(i)-48; 
            z=m+n+cr;
            if(z==0){
                ans='0'+ans;cr=0;}
            if(z==1){
                ans='1'+ans;cr=0;}
            if(z==2){
                ans='0'+ans;cr=1;}
            if(z==3){
                ans='1'+ans;cr=1;}    
            }
            System.out.println(ans);
        }}