// program
import java.util.*;
class Cartoon1 {
    void arrange(String s) {
        s = s + " ";
        String z = "";int c = 0;int max = 0;
        for (int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) != ' '){
                z += s.charAt(i);
                if(isVowel(s.charAt(i)) == true)
                    c++;
            }
            else{
                if(max<c)
                    max = c;
                c = 0;
                z = "";
            }
        }
        String x = "";String sp = "";
        for(int i = max ; i>= 0; i--){
            for (int j = 0 ; j < s.length() ; j++){
                if(s.charAt(j) != ' '){
                    x += s.charAt(j);
                    if(isVowel(s.charAt(j)) == true )
                        c++;
                }
                else{
                    if(c==i)
                        sp += x + " ";
                    c = 0;
                    x = "";
                }
            }
        }
        work(sp);
    }

    boolean isVowel(char a){
        a = Character.toUpperCase(a);
        switch(a){
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : return true ;
        }
        return false;
    }

    void work(String s){
        s = s + " ";
        String a = "";String z = ""; int c = 0; int d = 0; String x = "";
        for (int i = 0 ; i < s.length() ; i++){
            int k = 0;
            if(s.charAt(i) != ' '){
                z += s.charAt(i);
                if(isVowel(s.charAt(i)) == true)
                    c++;
            }
            else{
                for (int j = 0 ; j < s.length() ; j++){
                    if(s.charAt(j) != ' '){
                        x += s.charAt(j);
                        if(isVowel(s.charAt(j)) == true)
                            d++;
                    } 
                    else{
                        if((c==d)&&(i!=j))
                            k = 1;
                        x = "";
                        d = 0;
                    }
                }
                if (k==1)
                    z = send(z);
                a += z + " ";
                c = 0;
                z = "";
            }
        }
        System.out.println(Character.toUpperCase(a.charAt(0))+(a.substring(1)).toLowerCase());
    }

    String send (String s){
        String a = "";
        for (int i = 0 ;i < s.length() ; i++){
            a += (char)((int) s.charAt(i) + i + 1);
        }
        return a;
    }

    public static void main (String args []){
        System.out.println("Enter a string ");
        String a = new Scanner (System.in).nextLine();
        new Cartoon1(). arrange(a);
    }
} // a word with zero vowel will also be changed if there are 2 words with 0 vowel