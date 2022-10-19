class vowel2{
    public static void main(String w){
        int i,j,max=0,k=0;
        char y, c=0;
        String s="",s2="";
        for(i='A';i<='2';i++){
            for(j=0;j<w.length();j++){
                    c2=s.charAt(j);
                if("AEIOUaeiou".indexOf(c2)>0)
                k++;
                if(k>max){
                    max=k;
                    s2=s;}
                k=0;
                s="";
            }else if (c!=0)
                s+=c;
        }
        System.out.println("Word with "+max+"vowel:"+s2);
    }}

              