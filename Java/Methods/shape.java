package Methods;
import java.util.*;

class shape{
   public static void main(String args[]) {
      shapes s = new shapes();
      shapes s1 = new shapes(30,40);
      shapes s2 = new shapes(50);
      shapes s3 = new shapes(s2); 
   }
}

class shapes {
   int l;
   int b;
   double f;
   shapes() {
    l=0;
    b=0;
    System.out.println("No value");
   }
   shapes(int length, int breadth) {
    l=length;
    b=breadth;
    System.out.println("For rectangle: " + l + " " + b);
   }
   shapes(int side) {
    l=side;
    b=side;
    System.out.println("For square: "+ l);
   }
   shapes(shapes s) {
    l=s.l;
    b=s.b;
    System.out.println("Copying constructor: " + l + " " + b);
   }
}

