class s
{
    static void main(String s)
    {int i,j,k=s.length(),l=0;;
        String st="",st2="";
        st=s.substring(k-5);
        st2=s.substring(0,k-5);
        for(i=1;i<=k;i++){
            for(j=1;j<=k;j++){
                if(i==1){
                 if(l<st2.length())   
                System.out.print(st2.charAt(l));
                else
                    System.out.print(st.charAt(0));
                l++;}
                else if(j==1 && i<=(k+1)/2)
                    System.out.print(st.charAt(1));
                    else if(i==(k+2)/2)
                    System.out.print(st.charAt(2));
                else if(j==k && i>(k+2)/2)
                    System.out.print(st.charAt(3));
                else if(i==k)
                    System.out.print(st.charAt(4));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }}}