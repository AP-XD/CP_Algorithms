class Spat3{
    public static void main(String w){
        int i,j;
        for(i=w.length()-1;i>=0;i--){
            for(j=0;j<=i;j++)
           
            System.out.print(w.charAt(w.length()-1-i)+" ");
            System.out.println();
        }
    }}