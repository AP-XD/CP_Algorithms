class Overload{
   void triangle_area(int b,int h){
       double a=0.5*b*h;
       System.out.println("Area:"+a);
    }
    int triangle_area(int side){
        int ar=(int)Math.sqrt(3)*4*side*side;
        System.out.println("Area:"+ar);
        return ar;
    }
    float  triangle_area(float a,float b,float c){
        float s,ar;
        s=(a+b+c)/2.0f;
        ar=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area:"+ar);
        return ar;
    }
    public static void main (String args[]){
        Overload ob=new Overload();
        ob.triangle_area(12,6);
        ob.triangle_area(8);
        ob.triangle_area(3f,4f,5f);
    }
}