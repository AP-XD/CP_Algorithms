import java.util.*; 
class Duplicate_remove{  
   void remove(int a[])
     {int k= -1;
         for(int i=0;i<a.length;i++)
           if (a[i]==0)
             {k=i;break;} 
           for (int i=0;i<a.length;i++)
              for (int j=i+1;j<a.length;j++)
                if(a[j]==a[i])
                 a[j]=0;
         for (int i=0;i<a.length;i++)
          { if (i==k)
              System.out.print(a[k]+",");           
            if(a[i]!=0)
              System.out.print(a[i]+",");
             System.out.print("");
        }
     }
     public static void main(String args[])
       { Scanner sc=new Scanner(System.in);
            System.out.print("Enter size :");
            int s=sc.nextInt();
            int a[]=new int[s];
            for(int i=0;i<=(s-1);i++)
            { System.out.print("Enter element :");
               int sa =sc.nextInt();
               a[i]=sa;
            }
           Duplicate_remove ob=new Duplicate_remove();
           ob.remove(a);
        }
     }

// I have just inserted break and made k= -1