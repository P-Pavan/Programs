// push pop peek size
import java.util.Stack;

class Stacks {
    public static void main(String args[]) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st.peek() + " " + st.size());
        st.pop();
        System.out.println(st.size());
    }
}