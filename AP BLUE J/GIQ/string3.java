class string3{
    public static void main(String w){
        String st1="",st2="",w2="";
        char c;
       
        for(int i=0;i<=w.length()-1;i++){
            c=w.charAt(i);
            w2=c+w2;}
            w2+=' ';
        for(int i=0;i<=w2.length()-1;i++){
            c=w2.charAt(i);
            
        
        if(c==' '){
        st2+=' '+st1;
        st1="";}
        else
        st1=c+st1;
    }
    System.out.println(st2);}}