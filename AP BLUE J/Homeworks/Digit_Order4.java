class Digit_Order4{
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
        
    }System.out.println(res);}}