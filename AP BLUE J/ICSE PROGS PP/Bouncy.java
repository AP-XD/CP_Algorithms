class Bouncy{
    public static void main(int n){
        
        int s=0,i,j,cp=n,n1=n,t=0,d,k=0,k2=0;
        while(n1>0){
            s++;
            n1/=10;
        }int a[]=new int[s];
        for(i=0;i<s;i++){
            d=cp%10;
            a[i]=d;
            cp/=10;
        } 
        for(i=0;i<s-1;i++){
            for(j=0;j<s-i-1;j++){
                if(a[j+1]>a[j]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }}
         for(i=0;i<s;i++){
           k=k*10+a[i];
        }
        for(i=s-1;i>=0;i--){
            k2=k2*10+a[i];
        }
        
        if(n==k || n==k2)
        System.out.println("Not a Bouncy no.");
        else
        System.out.println("Bouncy no.");
    }}
        