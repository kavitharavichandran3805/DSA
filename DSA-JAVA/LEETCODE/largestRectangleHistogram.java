import java.util.Stack;

public class largestRectangleHistogram {
    public static void main(String[] args) {

        // int[] a = { 2, 1, 5, 6, 2, 3 };
        int[] a = { 2, 4 };
        Stack<Integer> s = new Stack<>();
        s.push(0);
        int val, val1;
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                val = forward(a, a[i], i);
                if (val > s.peek()) {
                    s.push(val);
                }
            } else if (i == a.length - 1) {
                val = backward(a, a[i], i);
                if (val > s.peek()) {
                    s.push(val);
                }
            } else {
                val = forward(a, a[i], i);
                val1 = backward(a, a[i], i);
                if ((val + val1) - a[i] > s.peek()) {
                    s.push(val + val1 - a[i]);
                }
            }
        }
        System.out.println(s.peek());
        System.out.println(s);
    }

    public static int forward(int[] a, int val, int i) {
        int s = val;
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] >= val) {
                s += val;
                System.out.println("Step " + j + " : " + s);
            } else {
                break;
            }
        }
        System.out.println("Forward : " + s);
        return s;
    }

    public static int backward(int[] a, int val, int i) {
        int s = val;
        for (int j = i - 1; j >= 0; j--) {
            if (a[j] >= val) {
                s += val;
                System.out.println("Step " + j + " : " + s);
            } else {
                break;
            }
        }
        System.out.println("Backward : " + s);
        return s;
    }
}
