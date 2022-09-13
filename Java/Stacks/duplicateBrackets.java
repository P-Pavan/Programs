package Programs.Java.Stacks;
import java.util.Scanner;
import java.util.Stack;

public class duplicateBrackets {
    public static void main(String argsp[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == ')') {
                if(st.peek() == '(') {
                    System.out.println("Duplicate Found!");
                    return;
                } else {
                    while(st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else st.push(ch);
        }
        System.out.println("No duplicates..");
    }
}
