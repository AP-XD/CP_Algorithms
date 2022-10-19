class Cvow{
    String ccv(String s){
        String a="AEIOUAaeioua",r="";
        int i,j;
        char c;
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            j=a.indexOf(c);
            if(j>=0)
            r+=a.charAt(j+1);
            else
            r+=c;
        }
        return r;
    }}
            