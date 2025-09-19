import java.util.Stack;

public class validParanthesis {
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        if (str.length() >= 2) {

        }
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (ch == ')') {
                    if (s.isEmpty() || s.pop() != '(') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (s.isEmpty() || s.pop() != '[') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (s.isEmpty() || s.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}
