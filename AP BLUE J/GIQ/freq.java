class freq{
    public static void main(String w){
        w=w.toUpperCase();
        String s="";
        int k=0;
        System.out.println("Character\t\t\tFrequency");
         for(char j='A';j<='Z';j++){
        for(int i=0;i<w.length();i++){
            char c=w.charAt(i);
           
            if(j==c)
            k++;
        }
        if(k>0)
        System.out.println(j+"\t\t\t\t"+k);
        k=0;
    }}}