class Digit_Order{
    public static void main(int x){
        int i,n,c,b;
        for(i=0;i<=9;i++){
            n=x;c=0;
            while(n>0){
            b=n%10;
            if(b==i)
                c++;
            n/=10;
        }
        if(c>0)
        System.out.println(i+" Frequency is:"+c);
    }
    
}
}