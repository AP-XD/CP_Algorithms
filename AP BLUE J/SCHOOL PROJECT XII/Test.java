class Test
{
    public static void main()
    {
        String s="ANNuAL ExAmiNAtioN";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.insert(6,"End")+"\n"+s.lastIndexOf('i',(s.indexOf('N',5))));
        
    }
}