class pro{
    public static void main(int CP,int SP){
        String p=(SP>CP)?"PROFIT":"LOSS";
        
        int k=Math.abs(CP-SP);
        System.out.println(p+":"+k);
    }}