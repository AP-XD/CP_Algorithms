class series2{
    void series(int n,int x){
        int c=3;
        double s=0;
        for(int i=1;i<=n;i++){
            s=s+(double)(power(x,i+1))/fact(c);
            c+=2;}
        System.out.println("Sum="+s);
    }

    int power(int a,int b)
    {
        int z=1;
        for(int i=1;i<=b;i++){
            z=z*a;
        }
        return z;}

    int fact(int f){
        int k=1;
        for(int i=1;i<=f;i++){
            k=k*i;
        }return  k;
    }

    public static void main(String args[]){
        series2 ob=new series2();
        ob.series(3,2);
    }
}