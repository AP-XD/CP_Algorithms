class Perf{
    public static void main(String args[]){
        int k=1,i=2,c=0;
        while(++i<6){c++;
        k*=i;}
        System.out.println(k+" "+c);
    }}