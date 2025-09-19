import java.util.*;

public class search_2d_sorted_arr {
    public static void main(String[] args) {

        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println(Arrays.toString(search(matrix, 6)));

    }

    public static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (target == matrix[row][mid]) {
                return new int[] { row, mid };
            } else if (target > matrix[row][mid]) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int rStart = 0;
        int rEnd = matrix.length - 1;
        int cMid = cols / 2;
        if (rows == 1) {
            return binarysearch(matrix, 0, 0, cols, target);
        }
        while (rStart < (rEnd - 1)) {// it means there are more than two rows int he matrix, and we have to minimize
                                     // those rows unitl we have two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (target == matrix[mid][cMid]) {
                return new int[] { mid, cMid };
            } else if (target > matrix[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        } // after performing all these functions, we have finally two rows in our hands
        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart, cMid };
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }
        if (target <= matrix[rStart][cMid - 1]) {
            return binarysearch(matrix, rStart, 0, cMid - 1, target);
        }
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarysearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1]) {
            return binarysearch(matrix, rStart, cMid + 1, cols - 1, target);
        } else {
            return binarysearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
