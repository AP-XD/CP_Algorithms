import java.util.*;
class Automorphic_Range
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int sqr,temp,c=0,i=1,rem;
    System.out.println("Enter The Range: ");
    int n=sc.nextInt();
    while(n!=0)
    {
    temp=i;
    sqr=i*i;
    while(i!=0)
    {
      c++;
      i=i/10;
    }
    rem=sqr % ((int)Math.pow(10,c));
    if(temp == rem)
    {
      System.out.println(i + ", ");
    }
   }
  }
}