
class ss3{
    public static void main(String w){
         char c,k='\0',l='\0';
         String j="";
        for(int i=0;i<w.length();i++){
           
            c=w.charAt(i);
            if(Character.isLowerCase(c)){
               
                k=Character.toUpperCase(c);
             j+=k;}
           else if(Character.isUpperCase(c)){
           l=Character.toLowerCase(c);
           j+=l;}
           
          
        } System.out.println(j);
    }}