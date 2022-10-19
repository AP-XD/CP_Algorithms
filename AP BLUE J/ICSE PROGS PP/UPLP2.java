import java.util.*;
class UPLP2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine(),n="",z="",l="";
        int max=0,i;
        char c;
        s=' '+s;
        for(i=0;i<s.length()-1;i++){
            c=s.charAt(i);
            if(c==' '){
                z+=s.charAt(i+1);
            }
            

        }
        System.out.println(z.toUpperCase()+".");
    }}

        