
class ss4{
    public static void main(String w){
         char c;
         int j=0,k=0;
         
        for(int i=0;i<w.length();i++){
           
            c=w.charAt(i);
            
            if(Character.isWhitespace(c))
               k++;
               else if(Character.isLetterOrDigit(c))
               j++;               
                  
            }System.out.println("No. of blank spaces="+k+"\nNo. of words:"+(k+1)+"\nNo. of Characters:"+j);
            
    }}