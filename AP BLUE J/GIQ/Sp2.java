class Sp2{
    public static void main(String w){
        int i,p;
        
        for(i=0;i<=w.length();i++){
            for(p=1;p<=i;p++){
            System.out.print(" ");}    
           
            System.out.println(w.substring(i,w.length()));
           
        }}}