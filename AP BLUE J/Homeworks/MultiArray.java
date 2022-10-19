import java.util.*;
class MultiArray{

     void accept(){
    Scanner sc=new Scanner(System.in);
  int s;
     do{
	System.out.println("Enter Size");
	s=sc.nextInt();
     }while(s<=0);
  int a[]=new int[s];
   int b[]=new int[s];
   for(int i=0;i<s;i++){
	a[i]=sc.nextInt();
	b[i]=sc.nextInt();
	}System.out.println("1st array");
	display(a);
	System.out.println("2nd array");
    display(b);
	multi(a, b);}
    void multi(int x[],int y[]){
	int s=x.length;
	int q[]=new int[s];
	for(int i=0;i<s;i++){
	q[i]=y[i]*x[s-i-1];}
	display(q);
	}
	void display(int z[]){
		for(int i=0;i<z.length;i++){
			System.out.println(z[i]+" ");
			}
			}
			public static void main(String args[]){
				MultiArray ob=new MultiArray();
				ob.accept();}}
	

