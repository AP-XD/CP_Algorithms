class Unique{
    public static void main(int n){
        int cp=n,c=0,k=0,d,i;
        for(i=0;i<=9;i++){
            cp=n;
            while(cp>0){
                d=cp%10;
                if(d==i)
                c++;
                cp/=10;
            }if(c>1)
            {k=1;
                break;
            }c=0;
        }
        if(k==0)
        System.out.println("Unique Number");
        else
        System.out.println("Not a Unique Number"); 
    }}
            