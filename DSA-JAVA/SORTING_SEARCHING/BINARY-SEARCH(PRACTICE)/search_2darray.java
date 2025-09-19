import java.util.Arrays;

public class search_2darray {
    public static void main(String[] args) {
        int[][] a = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 }
        };
        int t = 3;
        System.out.println(Arrays.toString(searchElement(a, t)));
    }

    public static int[] searchElement(int[][] a, int t) {
        int rows = a.length;
        int cols = a[0].length;
        int lb = 0, ub = cols - 1;
        while (lb < rows && ub >= 0) {
            if (a[lb][ub] == t) {
                return new int[] { lb, ub };
            } else if (a[lb][ub] > t) {
                --ub;
            } else {
                ++lb;
            }
        }
        return new int[] { -1, -1 };
    }
}
