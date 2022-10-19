import java.util.*;
class ssspace{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a sentence");
        String j="",w=sc.nextLine();
        int m=-1,k=0;
        w=' '+w;
        for(int i=0;i<w.length()-1;i++){
            char c=w.charAt(i),c2=w.charAt(i+1);
            
            if(c==' ' && c2!=' ')
            k++;
            if(c==' ')
            m++;
        }
        System.out.println("No. of Words:"+k+"No. of spaces:"+m);}}