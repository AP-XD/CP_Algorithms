class Digit_Order3{
void  removeRecur(int  n)
{
    // Store first digits as previous digit
    int prev_digit = n%10;
 
    // Initialize power
    int pow = 10;
    int res = prev_digit;
 
    // Iterate through all digits of n, note that
    // the digits are processed from least significant
    // digit to most significant digit.
    while (n>0)
    {
        // Store current digit
        int curr_digit = n%10;
 
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
        n = n/10;
    }
 
     System.out.println(res);
}
 
// Drive program
public static void main(String args[])
{
Digit_Order3 ob=new Digit_Order3();
ob.removeRecur(122533);   
}
}