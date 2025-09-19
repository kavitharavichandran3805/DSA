import java.util.*;

public class sortStack {
    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> result = new Stack<>();
        while (!s.isEmpty()) {
            if (result.isEmpty()) {
                result.push(s.pop());
            } else {
                insert(result, s.pop());
            }
        }
        return result;
    }

    public static void insert(Stack<Integer> s, int x) {
        if (s.isEmpty()) {
            s.push(x);
            return;
        }
        if (x > s.peek()) {
            s.push(x);
            return;
        }
        int top = s.pop();
        insert(s, x);
        s.push(top);
    }

    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        // s.push(3);
        // s.push(41);
        Stack<Integer> result = sort(s);
        System.out.println(result);

    }
}