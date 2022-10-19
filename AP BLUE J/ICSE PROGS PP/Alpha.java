class Alpha{
    public static void main(String s,int n){
        
        String z="";
        char y;
        int i,c=0;
    for(i=0;i<s.length();i++){
        y=Character.toUpperCase(s.charAt(i));
        
        c=y+n;
        if(c>90)
        c=c-90+65;
        if(c<65)
        c=90+1-(65-c);
        z+=(char)c;
    c=0;}
        System.out.print(z);
    }}