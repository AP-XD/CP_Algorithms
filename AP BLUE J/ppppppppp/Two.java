class Two{
    int a;
    static void exchange(Two ob,Two ob2){
        ob.a=One.x;
        ob2.a=One.x;

    }

    public static void main(String args[]){
        Two ob=new Two();
        Two ob2=new Two();
        ob.a=1;
        ob2.a=4;
        System.out.println("ob.a="+ob.a+" ob2.a="+ob2.a);
        exchange(ob,ob2);
        System.out.println("After exchange\nob.a="+ob.a+" ob2.a="+ob2.a);
    }
}