import java.util.*;

public class row_column_matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r, c, target;
        System.out.println("Enter the values of rows and columns:\n");
        r = scan.nextInt();
        c = scan.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the array elements:\n");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int[] nums : a) {
            for (int n : nums) {
                System.out.println(n + " ");
            }
        }
        System.out.println("Enter the element to be searched:\n");
        target = scan.nextInt();
        System.out.println(Arrays.toString(search(a, target)));
        scan.close();
    }

    public static int[] search(int[][] a, int target) {
        int row = 0;
        int col = a[0].length - 1;
        while (row < a.length && col >= 0) {
            if (a[row][col] == target) {
                return new int[] { row, col };
            } else if (a[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return new int[] { -1, -1 };
    }
}
