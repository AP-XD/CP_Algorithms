class alpha{
    public static void main(String w){
        String st="";char ch='\0',k;int i,j;
        st=w.toUpperCase();
        for(i=65;i<=90;i++){
           
            for( j=0;j<st.length();j++){
            k=st.charAt(j);
            if(k==i)
           
            System.out.print(k);
        }}}}