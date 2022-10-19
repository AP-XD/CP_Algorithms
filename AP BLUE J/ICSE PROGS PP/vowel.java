class vowel{
   
    static boolean fv(String s){
        int i,j,k=0,p=0; char c,c2;
        String v="AEIOU";
        s=s.toUpperCase();
        for(i=0;i<v.length();i++){
            c=v.charAt(i);
            for(j=0;j<s.length();j++){

                c2=s.charAt(j);
                if(c==c2)
                    k++;
            }
            if(k>1){
                p=1;
            }
            k=0;}
        if(p==1)
            return false;
        else
            return true;
    }
}
