import java.util.*;
class Add{
    public static void main(String[] args) {
    Overload_add obj1=new Overload_add();
    obj1.add();
    Overload_add obj2=new Overload_add();
    obj2.add(6,7);
    Overload_add obj3=new Overload_add();
    obj3.add(6.5,7.3);
    

    }
}

class Overload_add{
    	public void add(){
         		int a=5,b=9;
        		System.out.println("No parameters: " + (a+b));
    }
	public void add(int a, int b){
   
     		 System.out.println("Two parameters integer: " + (a+b));
    }
	public void add(double c, double d){
   
     		 System.out.println("Two parameters double: " + (c+d));
    }

   
}
