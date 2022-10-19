import java.util.*;
class sss{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String j="",w=sc.nextLine();
        int m=0,n=0,l=0;
        for(int i=0;i<=w.length();i++){
            char c=w.charAt(i);
            if(c>=65 && c<=90)
                m++;
            else if(c>=97 && c<=122)
            n++;
            else if((c>=65 && c<=90) || (c>=97 && c<=122) && ("aeiouAEIOU".indexOf(c)<=0))
            l++;
             if(c>=65 && c<=90){
             c+=32;j+=c;}
             
            else if(c>=97 && c<=122){
            c-=32;j+=c;}
             System.out.println("No. of uppercase characters="+m+"\nNo. of lowercase characters="+n+"\nNo. of consonants"+l+"\n Converted Word:"+j);
            }}}