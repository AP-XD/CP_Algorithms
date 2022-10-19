class SEL{
    public static void main(){
        int a[]={5,10,1,23,11,7},s=a.length,min=0,t=0,i;
        for(i=0;i<s;i++){
            min=i;
            for(int j=i+1;j<s;j++){
                if(a[j]<a[min]){
                    min=j;}
            }t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(i=0;i<s;i++)
        System.out.println(a[i]);
    }
}