//WAP in JAVA as per Q.No. 23; Sumita Arora
class Interest {
    public static void main(int P, int T){
        int R;
        if (P<2000 && T>=2)
        R=5;
        else if (P>=2000 && P<6000 && T>=2)
        R=7;
        else if (P>=6000 && T>=1)
        R=8;
        else if (T>=5)
        R=10;
        else 
        R=3;
        double A=P*Math.pow((1+0.01*R),T);
        System.out.println("Amount :"+A);
    }}

  