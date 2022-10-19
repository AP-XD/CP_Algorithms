/* program 11: Full Number Pattern 11 Pyramid
*/
//imports
import java.util.Scanner;


class FullNumberPatternPyramid11 
{
public static void main(String[] args) 
{
//declarations
int input,RefNum;


System.out.println("enter the size of the pyramid");
input=new Scanner(System.in).nextInt();
if(input>0)
{
for (int rows=1;rows<=input ;rows++ )
{
RefNum=rows;
for(int spaces=1;spaces<=input-rows;spaces++)
{
System.out.print("  ");
}//for
for (int col=1;col<=(2*rows)-1 ;col++ )
{
if(col<=rows)
{
System.out.print(col);
System.out.print(" ");
}//if
else
{
RefNum--;
System.out.print(RefNum);
System.out.print(" ");
}//else
}//for
System.out.println();
}//for
}//if
else
{
System.out.println("enter positive integers only");
}//else
}//main
}//class