class LEX{
    public static void main(String s){
        s+=' ';int k=0,i,j,s1;
        char c;String a[]=new String[6],z="",t="";
        for(i=0;i<s.length();i++){
            c=s.charAt(i);
            if(c==' '){
            a[k++]=z;z="";}
            else
            z+=c;}
        s1=s.length();
        
        for(i=0;i<s1-1;i++){
            for(j=0;j<s1-i-1;j++){
                if(a[j+1].compareTo(a[j])>0){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }}for(i=0;i<6;i++){System.out.print(a[i]);}
         }}
        