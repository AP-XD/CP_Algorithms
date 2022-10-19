class pal{
    public static void main(String w){
        String s="";
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
            s=c+s;
        }System.out.println(w+s);
    }}