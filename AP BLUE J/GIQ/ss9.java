
class ss9{
    public static void main(String w){
         char c;
         int i,j=0,k=0,l=0,m=0;
        for(i=0;i<w.length();i++){
           
            c=w.charAt(i);
            if(c>='A' && c<='Z')
            j++;
               
            else if(c>='a' && c<='z')
            k++;
            else if(c>='0' && c<='9')
            l++;
            else
            m++;
           
        }
       System.out.println("No. of uppercase characters="+j+"\nNo. of lowercase characters="+k+"\nNo. of special Characters:"+m
       +"\nNo. of digits="+l);
            
    }}