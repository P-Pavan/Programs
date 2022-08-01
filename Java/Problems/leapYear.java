import java.util.*;
public class leapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter your Birth Year: ");
        year = sc.nextInt();
        if ((year%4 == 0) && (year%100 != 0 || year%400 == 0)) {
            System.out.println("It's leap year.. Take gifts!");
        } 
        else {
            System.out.println("No gifts.. For you peasants..");
        } 
    }    
}
