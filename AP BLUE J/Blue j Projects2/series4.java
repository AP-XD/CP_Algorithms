public class series4{
    public static void main(int n) {
            //Max. No. In Series
        for(int i=1; i<=n; i++){
            //Spacing Logic
            for(int s=i;s<=n;s++){
                System.out.print(" ");
            }
            
            for(int k=i-1;k>=1;k--){
                System.out.print(k+"");
            }
            System.out.println();
        }
    }
}


