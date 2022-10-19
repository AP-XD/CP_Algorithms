class ss
{
    public static void main(String w){
        String st2="";
        w=' '+w;
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            
            if(c==' '){
                char ch=w.charAt(i+1);
            st2+=' '+ Character.toUpperCase(ch);
            
           i=i+1;}
            else
            st2+=c;
        }System.out.println(st2);}}
        