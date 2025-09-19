
// import java.util.Arrays;
import java.util.Stack;

public class longestHistogram {

    // BRUTE FORCE APPROACH
    public static int bruteForce(int[] a) {
        int lc = 0, rc = 0;
        int maxArea = 0;
        for (int i = 0; i < a.length; i++) {
            lc = getLeftCount(a, a[i], 0, i); // o(n)
            rc = getRightCount(a, a[i], i, a.length); // o(n) and also we are doing this for each element o(n*2n)=
                                                      // o(2n^2)=o(n^2)
            maxArea = Math.max(maxArea, a[i] * (rc - lc - 1));
        }
        return maxArea;
    }

    public static int getLeftCount(int[] a, int current, int s, int e) {
        for (int i = e - 1; i >= s; i--) {
            if (a[i] < current) {
                return i;
            }
        }
        return -1;
    }

    public static int getRightCount(int[] a, int current, int s, int e) {
        for (int i = s; i < e; i++) {
            if (a[i] < current) {
                return i;
            }
        }
        return a.length;
    }

    // BETTER APPRAOCH USING PSE AND NSE

    public static int better(int[] a) {
        int[] pse = getPSE(a); // o(n)
        int[] nse = getNSE(a); // o(n)
        int maxArea = 0;
        for (int i = 0; i < a.length; i++) {
            maxArea = Math.max(maxArea, a[i] * (nse[i] - pse[i] - 1)); // o(n) so total o(3n)=o(n)
        }
        return maxArea;
    }

    public static int[] getNSE(int[] a) {
        int[] result = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = a.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && a[i] < a[s.peek()]) {
                s.pop();
            }
            result[i] = s.isEmpty() ? a.length : s.peek();
            s.push(i);
        }
        return result;
    }

    public static int[] getPSE(int[] a) {
        int[] result = new int[a.length];
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[i] < a[s.peek()]) {
                s.pop();
            }
            result[i] = s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        return result;
    }

    // OPTIMAL APPROACH

    public static int optimal(int[] a) {
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        int ele, nse, pse;
        for (int i = 0; i < a.length; i++) {
            while (!s.isEmpty() && a[s.peek()] > a[i]) {
                ele = s.peek();
                s.pop();
                nse = i;
                pse = s.isEmpty() ? -1 : s.peek();
                maxArea = Math.max(maxArea, a[ele] * (nse - pse - 1));
            }
            s.push(i);
        }

        while (!s.isEmpty()) {
            nse = a.length;
            ele = s.peek();
            s.pop();
            pse = s.isEmpty() ? -1 : s.peek();
            maxArea = Math.max(maxArea, a[ele] * (nse - pse - 1));
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] a = { 3, 2, 10, 11, 5, 10, 6, 3 };
        System.out.println(better(a));
    }
}
