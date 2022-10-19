import java.util.*;
class Decode_Shift
{   
    public static void main(String args[])/**main() declaration*/
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("CODED TEXT : "); /**inputting coded text*/
        String s =sc.nextLine(),dec="";
        int l = s.length(),a,b,i,shift;char ch1, ch2;/**Variable declaration and initialization*/
        s = s.toUpperCase()+" "; /**converting the coded text into Uppercase & adding a space at the end*/
        if(l>=100) /** checking whether length of inputted code is less than 100*/
            System.out.println("INVALID LENGTH OF CODED TEXT");/**Displaying the message*/
        else
        {
            System.out.print("SHIFT: ");
            shift =sc.nextInt();
            if(shift<1 || shift>26) /** checking whether shift value is between 1 and 26*/
                System.out.println("INVALID SHIFT VALUE");/**Displaying the message*/
            else
            {
                for(i=0; i<l; i++) 
                {
                    ch1 = s.charAt(i);/** extracting characters one by one*/
                    ch2 = s.charAt(i+1);/** extracting the next character*/
                    a = ch1 + shift - 1; /**storing ASCII values after adding shift to the current character*/
                    b = ch2 + shift - 1;/** storing ASCII values after adding shift to the next character * If the currrent character and the next character are both 'Q' then we have a 'space' * hence the ASCII value should be 32*/ 
                    if((char)a == 'Q' && (char)b == 'Q') 
                    { a = 32; i++; } 
                    if(a>90)
                        a = a - 26;
                    if(ch1 != ' ')
                        dec = dec + (char)a; /** finally adding the decoded character to the new String*/
                }
                System.out.println("DECODED TEXT: "+dec);/**Displaying the output*/
            }
        }
    }/**end of main()*/
}/**end of Decode_Shift*/