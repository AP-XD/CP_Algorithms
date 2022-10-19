import java.util.*;
class Remove{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s,s2="";
        char c,c2;
        System.out.println("Enter a Sentence");
        s=sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            boolean F = false;
            c=s.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                
                c2=s2.charAt(j);
                if(c==c2 || c==(c2+32) || c==(c2-32))
                {
                    F = true;
                    break; 
                }
            }
            if (F== false) {
                s2 +=s.charAt(i);
            }
        }
        System.out.println(s2);
    }
}