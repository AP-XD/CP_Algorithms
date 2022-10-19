import java.util.*;
class mid{

    public static void main(String w){
        
        Scanner sc=new Scanner(System.in); 
        
        int j=0,k=0,p=w.indexOf(' '),q=w.lastIndexOf(' ');
        String st=w.substring(0,p),st2=w.substring(q),st1="",st3="";
        System.out.println("Enter middle name");
        st1=sc.next();
        st3=st+' '+st1+st2;
        System.out.println("Full name:"+st3);

    }}