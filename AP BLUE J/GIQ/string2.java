class string2{
    public static void main(String w){
        String st1="",st2="";
        char c;
        w=w+' ';
        for(int i=0;i<=w.length()-1;i++){
            c=w.charAt(i);
            
        
        if(c==' '){
        st2+=' '+st1;
        st1="";}
        else
        st1=c+st1;
    }
    System.out.println(st2.trim());}}