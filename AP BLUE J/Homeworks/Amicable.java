class Amicable{
    public static void main(int a,int b){
        int s1=0,s2=0,i;       
        for(i=1;i<a;i++){
            if(a%i==0)
                s1+=i;
        }
        if(s1==b){
            for(i=1;i<b;i++){
                if(b%i==0)
                    s2+=i;
            } 
            if(s2==a)
                System.out.println("Amicable pair");
            else
                System.out.println("Not an Amicable pair");
        }
    }
}