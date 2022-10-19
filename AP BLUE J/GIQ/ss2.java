import java.util.*;
class ss2{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String w,c,o;
        
        do{
            System.out.println("Enter a word in lowercase");
            w=sc.nextLine();
            c=w.toLowerCase();
        }while(c!=w);
        o=w.replace('i','*');
        System.out.println(o);
    }}
        
            
            
        
        