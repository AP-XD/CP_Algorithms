class E_Bill2{
    void charge(int u){
        double c=0;
        if(u<=100)
        c=50+u*0.9;
        else if(u>100 && u<=200)
        c=50+100*.9+(u-100)*1;
         else if(u>200 && u<=400)
        c=50+100*.9+100*1+(u-200)*1.25;
        System.out.print("Electric Charge:"+c);
    }}
        