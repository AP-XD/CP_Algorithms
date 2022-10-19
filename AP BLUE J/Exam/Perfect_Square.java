class Perfect_Square{
    public static void main(String args[]){
        int i,j,s;
        for(i=1;i<=1000;i++){
            s=0;
        for(j=1;j<i;j++){
            if(i%j==0)
            s+=j;
        }
        if(s==i)
        System.out.print(i+",");
    }
}
}