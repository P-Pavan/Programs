// SI = PTR/100

import java.util.*;
public class simpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Princple: " );
        float p= sc.nextFloat();
        System.out.print("Time: " );
        float t= sc.nextFloat();
        System.out.print("Rate of Interest: " );
        float r= sc.nextFloat();
    
        System.out.print("Simple Interest: " + ((p*t*r)/100));
    }
}
