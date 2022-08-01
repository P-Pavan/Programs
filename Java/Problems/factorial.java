import java.util.*;

class factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();

        int fact = 1;
        for(int i = f; i>1; i--) {
            fact*= i;
        }
        System.out.println(f + "! = " + fact);
    }
}