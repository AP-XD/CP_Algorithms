class Armstrong_No{
    public static void main(int n){
        int cp=n,d,s=0;
        
        while(n>0){
            d=n%10;
            s=s+d*d*d;
            n/=10;
        }
        if(cp==s)
        System.out.println("The no. "+cp+" is an Armstrong number");
        else
        System.out.println("The no. "+cp+" is not an Armstrong number");
    }}