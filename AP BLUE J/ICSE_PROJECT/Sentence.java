import java.util.*;
class Sentence
{
    public static void main(String args[])/**main function definition*/
    {
        String s,s2="",d="",s3="";/**variable declaration and initialization*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        s=sc.nextLine();
        int i,t1=0,t=0,l=s.length();
        char c,c2;
        s=s.toUpperCase();
        for(i=0;i<l;i++)
        { c=s.charAt(i);
            if(i<l-1){
                c2=s.charAt(i+1);
                if(c==c2)
                {
                    d+=""+c+c2+" ";/**concatenation*/
                    t++;/**counter value increment by 1*/
                }
            }
            if("AEIOUaeiou".indexOf(c)>=0)/**vowel checking*/
            {   s2+='*';/**forward concatenation*/
                s3+=c;/**forward concatenation*/
                t1++;/**counter value increment by 1*/
            }else
                s2+=c;/**forward concatenation*/
        }
        System.out.println(s+"\nDouble letters:"+d+" Total="+t+"\nVowels:"+s3+" Total="+t1+"\nAfter replacing all the vowels by *(asterisk) symbol of the sentence:\n"+s2);/**displaying the message*/
    }/**end of main()*/
}/**end of class Sentence*/
