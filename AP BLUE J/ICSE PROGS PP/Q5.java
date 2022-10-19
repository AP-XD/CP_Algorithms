import java.util.*;
class Q5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        String s,z="",su="";
        System.out.println("Enter a name");
        s=sc.nextLine();
        System.out.print("Enter (1/2)");
        int ch,i,k=0;
        ch=sc.nextInt();
        s=' '+s;
        switch(ch){
            case 1:
            k=s.lastIndexOf(' ');
            su=s.substring(k);
            
            for(i=0;i<=k;i++){
                if(s.charAt(i)==' ')
                z+=s.charAt(i+1)+". ";}
             System.out.println(z+su);   
        break;
        case 2:
        
        for(i=0;i<s.length()-1;i++){
                if(s.charAt(i)==' ')
                z+=s.charAt(i+1)+". ";}
          System.out.println(z);   
        break;      
        default:
        System.out.println("Wrong choice");
    }
}
}
