import java.util.Arrays;

public class flipImage {
    public static int[][] flipAndInvertImage(int[][] image) {
        int temp;
        for (int[] row : image) {
            for (int i = 0; i < (row.length + 1) / 2; i++) {
                temp = row[i] ^ 1;
                row[i] = row[row.length - i - 1] ^ 1;
                row[row.length - i - 1] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 1, 1 }
        };
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
}