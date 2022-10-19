import java.util.*;
class UPLP{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine(),n="",z="",l="";
        int max=0,i;
        char c;
        s+=' ';
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c!=' '){
                z+=c;
            }
            else{
                if(z.length()>max)
                {l=z;
                    max=z.length();
                 }z="";}
            if(c>=65 && c<=90)
                c+=32;
            else if(c>=97 && c<=122)
                c-=32;
            n+=c;

        }
        System.out.println(n+"\n"+l.toUpperCase());
    }}

        