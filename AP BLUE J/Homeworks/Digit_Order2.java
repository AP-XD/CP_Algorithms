class Digit_Order2{
    void gen(int x){
        int i,n,c,b,g=x,d,d1,r=0,xy=x;
        int prev_digit = xy%10;
        int pow = 10;
        int res = prev_digit;
        
        while (xy>0)
    {
        // Store current digit
        int curr_digit = xy%10;
 
        if (curr_digit != prev_digit)
        {
            // Add the current digit to the beginning
            // of result
           res += curr_digit * pow;
 
           // Update previous result and power
           prev_digit = curr_digit;
           pow *= 10;
        }
 
        // Remove last digit from n
        xy/=10;
    } System.out.println(res);
        while(res>0)
        {d1=res%10;
         r=r*10+d1;
         res/=10;}
            
        while(r>0){            
            d=r%10;
            for(i=d;i<=d;i++){
                n=x;c=0;
                while(n>0){
                    b=n%10;
                    if(b==i)
                        c++;
                    n/=10;
                }
                if(c>0)
                    System.out.println(i+" Frequency is:"+c);
            }
            r/=10;
        }
    }


    public static void main(String args[])
    {
        Digit_Order2 ob=new  Digit_Order2();
        ob.gen(496930119);
    }}