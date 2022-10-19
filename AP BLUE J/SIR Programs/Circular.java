import java.util.*;
class Circular{
    private String str;
    private int n, l;
    void form(){
        str=new Scanner(System.in).next();
        l=str.length();
        n=l*2-1;
        for (int i=0;i <l ; i++)
            display(i);
        for(int i=l-1; i>=0 ; i--)
            display(i);
    }

    void display(int i ){
        StringBuffer br=new StringBuffer(str.substring(0,i));
        System.out.print(br);
        for( int j=0; j <= (l-i)*2-1 ; j++)
            System.out.print(str.charAt(i));        
        System.out.println(br.reverse());
    }

    public static void main(String args[]){
        new Circular().form();
    }
}