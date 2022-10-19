class tri{
void triangle(int x,int y,int z){
    if(x==y && y==z && z==x)
     System.out.println("Equilateral Triangle");
    else if(x==y || y==z || z==x)
     System.out.println("Isosceles Triangle");
    else if(x!=y && y!=z && z!=x)
     System.out.println("Scalene Triangle");
    }}
     
     
    