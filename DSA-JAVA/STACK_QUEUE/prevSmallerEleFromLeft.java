import java.util.*;

public class prevSmallerEleFromLeft {
    public static void main(String[] args) {
        int[] a = { 4, 1, 2, 10, 8 };
        int[] result = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[i] <= s.peek()) {
                s.pop();
            }
            if (s.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = s.peek();
            }
            s.push(a[i]);
        }
        System.out.println(Arrays.toString(result));

    }
}