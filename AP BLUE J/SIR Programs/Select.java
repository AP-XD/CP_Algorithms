import java.util.*;
class Select{
    String str, wrd ;
    Select(){
        str=wrd="";
    }

    Select(String x, String y){
        str=x; wrd=y;
    }

    void show(){

        int l=wrd.length();
        String p[]=str.split(" ");
        for(int i=0; i<p.length ; i++){
            String k=p[i];

            for(int j=0; j<=k.length()-l; j++){
                String z=k.substring(j,j+l);
                if(z.equals(wrd)){
                    System.out.println(k);
                    break;
                }
            }
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String a=sc.nextLine();
        System.out.println("enter a word");
        String b=sc.next();
        Select ob=new Select(a,b);
        ob.show();
    }
}