import java.io.*;
import java.util.*;
public class Dequeue
{
    static char s,s1=' ';
    static int n=0;
    public static void first(LinkedList l)
    { 
        System.out.println("1. add");
        System.out.println("2. remove");
        System.out.println("3. display");
        System.out.println("4. exit");
        //   System.out.println(l);
        try
        {
            System.in.skip(5*n); 
            char s=(char)System.in.read();
            //      System.out.println(s);
            choose(l,s);
        }
        catch(Exception e){}
    }

    public static void main(String as[])
    {
        LinkedList l1=new LinkedList();
        first(l1);
    }

    public static void choose( LinkedList l,char s) throws Exception
    {
        n++;
        if((s=='1')||(s=='2'))
        {
            System.out.println(" a) Front end");
            System.out.println(" b) Rear end");
            System.out.println(" c) back"); 
            work(l,s); 
        }
        else if(s=='3')
        {
            System.out.println(l);
            rest(l); 
        }
        else if(s=='4')
        {
            System.exit(0);
        } 

        else
        {
            System.out.println(">>>>>>  BAWARI PUCCHH SAHI DAL <<<<<<<<");
            rest(l);
        } 
    }

    public static  void work(LinkedList l,char s) throws Exception
    {
        System.out.println("Enter the choice ");
        System.in.skip((5*n)+2);
        char s1=(char)System.in.read();
        //    System.out.println(s1);
        if(s1=='c')
        {
            first(l);
        }
        else if(s=='1')
            frontEnd(s1,l);
        else if(s=='2')
            backEnd(s1,l);
    }

    public static void rest(LinkedList l)
    {
        try
        {
            Thread.sleep(2000);
            first(l);
        }
        catch(Exception e){};
    }

    public static void frontEnd(char s1,LinkedList l) throws Exception
    {
        if(s1=='a')
        {
            System.out.println("Enter the String");
            System.in.skip((5*n)+4);
            char s2=(char)System.in.read();
            l.offerFirst(s2);
            //     System.out.println(l);
            rest(l);
        }   
        else if(s1=='b') 
        {
            System.out.println("Enter the character");
            System.in.skip((5*n)+4);
            char s2=(char)System.in.read();
            l.offerLast(s2);
            //     System.out.println(l);
            rest(l);
        } 
        else
        {
            System.out.println(">>>>>>  BAWARI PUCCHH SAHI DAL <<<<<<<<");
            rest(l);
        }
    }

    public static void backEnd(char s1,LinkedList l)
    {
        if(s1=='a')
        {
            if(l.size()!=0)
                l.removeFirst();
            else
                System.out.println("please insert elements first(:(: BAWARI  PUCCCHHH :):)"); 
            //     System.out.println(l);
            rest(l);
        }   
        else if(s1=='b') 
        {
            if(l.size()!=0)
                l.removeLast();
            else
                System.out.println("please insert elements first (:(: BAWARI  PUCCCHHH :):)");
            //      System.out.println(l);
            rest(l);
        } 
        else
        {
            System.out.println(">>>>>>  BAWARI PUCCHH SAHI DAL <<<<<<<<");
            rest(l);
        }
    }

}