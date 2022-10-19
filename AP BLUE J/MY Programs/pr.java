class pr{
    int product (int a,int b){
        return a*b;
    }

    void series(){int i,s=0;
        for(i=1;i<=9;i++){
            s+=product(i,i+1);
        }
        System.out.print("Sum of Series:"+s);
    }}
