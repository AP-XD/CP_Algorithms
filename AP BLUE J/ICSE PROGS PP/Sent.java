class Sent{
    public static void main(String s,String k){
        int i,j,h=0;
        char c;
        String z="";
        s+=' ';
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==' '){
             for(j=1;j<=z.length();j++){
                 if(k.equals(z.substring(0,j)))
                 h++;
                } 
                z="";
            } 
                else if(c!=' ')
                z+=c;
            }
            System.out.print(h);
        }}