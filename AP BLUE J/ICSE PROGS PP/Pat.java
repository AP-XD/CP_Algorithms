import java.util.*;
class Pat{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for AN \n2 for NN");
        int ch,i,j,k=0;
        ch=sc.nextInt();

        switch(ch){
            case 1:
            for(i=1;i<5;i++){
                for(j=1;j<=7;j++){
                    if(j==1)
                        System.out.print('A');
                    else if(j==7)
                        System.out.print('A');
                    else{
                        if(i%2!=0)
                            System.out.print('*');
                        else
                            System.out.print('#');}
                        }
                        System.out.println();
                    }
                        break;
                        case 2:
                        for(i=5;i>=1;i--){
                            for(j=1;j<=i;j++){
                             System.out.print(j);
                            }
                            for(j=1;j<=k;j++){
                                
                                 System.out.print("*");
                            }k+=2;
                         
                            for(j=i;j>=1;j--){
                             System.out.print(j);
                            }System.out.println();}   
                        break;
                        default:
                        System.out.println("Wrong choice");
                    }
                }
            }
