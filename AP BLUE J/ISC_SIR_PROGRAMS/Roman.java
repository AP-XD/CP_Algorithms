import java.util.Scanner;
class Roman
{
    void generate(int n) {
        int d=0,i=0;String r="";
        while(n>0){
            d=n%10;
            i++;
            if(i==1)
            { if (d<4) r=mag(d,'I')+r;
                if (d==4) r="IV"+r;
                if (d==5) r="V"+r;
                if (d>5 && d<9) r="V"+mag(d-5,'I')+r;
                if (d==9) r="IX"+r;
            }

            if(i==2)
            { if (d<4) r=mag(d,'X')+r;
                if (d==4) r="XL"+r;
                if (d==5) r="L"+r;
                if (d>5 && d<9) r="L"+mag(d-5,'X')+r;
                if (d==9) r="XC"+r;
            }

            if(i==3)
            { if (d<4) r=mag(d,'C')+r;
                if (d==4) r="CD"+r;
                if (d==5) r="D"+r;
                if (d>5 && d<9) r="D"+mag(d-5,'C')+r;
                if (d==9) r="CM"+r;
            }

            if(i==4)
                r=mag(d,'M')+r;
            n=n/10;
        }
        System.out.print(r);
    }

    String mag(int pos,char c){
        String s="";
        for(int i=0;i<pos;i++) 
            s+=c;
        return s;
    }

    public void get(){
        //taking inputs
        System.out.println("Enter a no");
        int n= new Scanner(System.in).nextInt();
        generate(n);
    } //end of get()
    public static void main(String args[])
    {
        new Roman().get();
    }
}    