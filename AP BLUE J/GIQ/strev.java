class strev{
    public static void main(String w){
        String st1="",st2="";
        char c,c2;
        w+=' ';
        int k=0;
        for(int i=0;i<w.length();i++){
            c=w.charAt(i);

            if(c==' '){
                for(int j=0;j<st1.length();j++){
                    c2=st1.charAt(j);
                    st2=c2+st2;}
                if(st1.equals(st2))
                    k++;
                st1="";
                st2="";}
            else
                st1+=c;
        }
        System.out.println("No. of palindrome words:"+k);}}