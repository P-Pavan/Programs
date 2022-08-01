package Problems;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String: ");
        String  txt = sc.nextLine().toLowerCase();
        String rev = "";
        
        for(int i = txt.length()-1; i>=0; i--) {
            rev += txt.charAt(i);
        }

        if(txt.equals(rev)) {
            System.out.println(rev + " is Palindrome");            
        }
        
    }    
}
