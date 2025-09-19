import java.util.Arrays;

public class search_sorted_matrix {
    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        int t = 14;
        System.out.println(Arrays.toString(searchElementMatrix(a, t)));
    }

    public static int[] bs(int[][] a, int t, int row, int s, int e) {
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[row][mid] == t) {
                return new int[] { row, mid };
            } else if (a[row][mid] > t) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] searchElementMatrix(int[][] a, int t) {
        int rows = a.length;
        int cols = a[0].length;
        if (rows == 1) {
            return bs(a, t, 0, 0, cols - 1);
        }
        int cmid = cols / 2;
        int rs = 0, re = rows - 1;
        while (rs < (re - 1)) {
            int mid = rs + (re - rs) / 2;
            if (a[mid][cmid] == t) {
                return new int[] { mid, cmid };
            }
            if (a[mid][cmid] > t) {
                re = mid;
            } else {
                rs = mid;
            }
        }
        if (a[rs][cmid] == t) {
            return new int[] { rs, cmid };
        }
        if (a[rs + 1][cmid] == t) {
            return new int[] { rs + 1, cmid };
        }
        if (a[rs][cmid - 1] >= t) {
            return bs(a, t, rs, 0, cmid - 1);
        }
        if (a[rs][cmid + 1] <= t && a[rs][cols - 1] >= t) {
            return bs(a, t, rs, cmid + 1, cols - 1);
        }
        if (a[rs + 1][cmid - 1] >= t) {
            return bs(a, t, rs + 1, 0, cmid - 1);
        }
        return bs(a, t, rs + 1, cmid + 1, cols - 1);

    }
}
