class Spat2{
    public static void main(String w){
        int i,p,k=1;
        
        for(i=w.length();i>=0;i--){
            for(p=2;p<=k;p++){
            System.out.print(" ");}    
           
            System.out.println(w.substring(0,i));
            k++;
        }}}