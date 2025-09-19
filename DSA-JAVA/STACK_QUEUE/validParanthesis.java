import java.util.Stack;

public class validParanthesis {
    static boolean isBalanced(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                s.push(ch);
            } else {
                if (!s.isEmpty()) {
                    if (ch == ')' && s.peek() == '(') {
                        s.pop();
                    } else if (ch == ']' && s.peek() == '[') {
                        s.pop();
                    } else if (ch == '}' && s.peek() == '{') {
                        s.pop();
                    } else {
                        s.push(ch);
                    }
                } else {
                    s.push(ch);
                }
            }
        }
        return s.size() == 0;

    }

    static boolean ispar(String x) {
        if (x.length() <= 1) {
            return false;
        }
        Stack<Character> s = new Stack<>();
        for (Character val : x.toCharArray()) {
            if (val == '(' || val == '[' || val == '{') {
                s.push(val);
            } else {
                if (val == ')') {
                    if (s.isEmpty() || s.pop() != '(') {
                        return false;
                    }
                } else if (val == ']') {
                    if (s.isEmpty() || s.pop() != '[') {
                        return false;
                    }
                } else {
                    if (s.isEmpty() || s.pop() != '{') {
                        return false;
                    }
                }

            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("([{]})"));
    }
}
