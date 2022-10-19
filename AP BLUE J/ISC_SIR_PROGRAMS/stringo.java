import java.util.*;
class stringo{
    String txt,y;char[]b={'A','E','I','O','U'};
    stringo(){
        txt="";y="";
    }

    void readstring(){
        Scanner s=new Scanner(System.in);
        do{System.out.println("enter a sentence ending with .");
            txt=s.nextLine().trim();
        }while((txt.charAt(txt.length()-1)!='.')||(txt.toUpperCase().equals(txt)==false));
    }

    void calc(){
        StringTokenizer st=new StringTokenizer(txt,". ?,;");int z=st.countTokens();
        for(int p=0;p<z;p++){
            String fd=st.nextToken();
            if(fd.length()==1){y+=(int)(fd.charAt(0)+32);}
            else if(fd.length()==2){
                y+= Character.toString(circ(fd.charAt(0),-1))+(Character.toString(circ(fd.charAt(1),1)));
            }
            else{
                for(int q=0;q<fd.length()/2;q++){
                    y+=circ(fd.charAt(q),-1);
                }
                for(int q=fd.length()/2;q<fd.length();q++){byte v=0;
                    for(int t=0;t<5;t++){
                        if(fd.charAt(q)<b[t]){v=1;y+=(char)(b[t]);break;}
                    }
                    if(v==0){y+=b[0];}
                }
            }
            y+=" ";
        }
        System.out.println(y);
    }

    char circ(char a,int l){int g=65;
        if(a+l<65){g=39;}
        return (char)(((a+l+g)%26)+65);
    }

    public static void main(){
        stringo o=new stringo();
        o.readstring();
        o.calc();
    }
}
