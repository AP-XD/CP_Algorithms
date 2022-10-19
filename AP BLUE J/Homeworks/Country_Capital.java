import java.util.*;
class Country_Capital{
	void accept(){
		Scanner sc=new Scanner(System.in);
		int s,c=0,z=0;
		do{
			System.out.println("Enter Size");
			s=sc.nextInt();
		}while(s<=0);
		String a[]=new String[s];
		String b[]=new String[s];
		for(int i=0;i<s;i++){
			a[i]=sc.nextLine();
		b[i]=sc.nextLine();}
		System.out.println("Countries:");
		display(a);
		System.out.println("Capitals:");
		display(b);
		System.out.println("Enter a Country name");
		String q=sc.nextLine();
		int i;
		for(i=0;i<s;i++){
	     if(a[i]==q){
			  z=i;
			  
			  c=1;
			 
			 break;}}
			 if(c==1)
			 System.out.println("Capital name "+b[z]);
	     else if(c==0)
      System.out.println("Country is not found");}
      void display(String z[]){
		for(int i=0;i<z.length;i++){
			System.out.println(z[i]+" ");
			}
			}
	
	public static void main(String args[]){
	Country_Capital ob=new Country_Capital();
		ob.accept();}}
