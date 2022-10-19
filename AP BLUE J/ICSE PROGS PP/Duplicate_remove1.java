import java.util.*; 
class Duplicate_remove1{  
   void remove(int a[])
     {int k= -1,d=0,c=0;
         int b[]=new int[a.length];
         for(int i=0;i<a.length;i++)
           if (a[i]==0)
             {k=i;break;} 
           for (int i=0;i<a.length;i++){
              for (int j=i+1;j<a.length;j++)
                if(a[j]==a[i])
                {
                 if(a[j]!=0)
                 c++;
                 a[j]=0;
                }
                if(c!=0)
                b[d++]=c;
                c=0;
            }
         for (int i=0;i<d;i++)
          {  
              
              System.out.println(b[i]+1); 
             
        }
     }
     public static void main(String args[])
       { Scanner sc=new Scanner(System.in);
            System.out.print("Enter size :");
            int s=sc.nextInt();
            int a[]=new int[s];
            for(int i=0;i<=(s-1);i++)
            { System.out.print("Enter element :");
               int sa=sc.nextInt();
               a[i]=sa;
            }
           Duplicate_remove1 ob=new Duplicate_remove1();
           ob.remove(a);
        }
     }

// I have just inserted break and made k= -1