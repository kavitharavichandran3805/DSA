import java.util.Stack;

public class reverseStack {
    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int val = s.pop();
        reverse(s);
        insertAtBottom(s, val);

    }

    static void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original stack: " + stack);
        reverse(stack);
        System.out.println("Reversed stack: " + stack);
    }
}
