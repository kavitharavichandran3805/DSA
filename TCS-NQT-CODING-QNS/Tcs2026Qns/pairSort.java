
// Input: [(3, 5), (1, 2), (3, 2), (1, 1), (2, 8)]

// Output: (1, 1), (1, 2), (2, 8), (3, 2), (3, 5)
import java.util.*;

public class pairSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().trim().split(" ");
            a[i][0] = Integer.parseInt(input[0]);
            a[i][1] = Integer.parseInt(input[1]);
        }
        int minIndex = -1;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j][0] < a[minIndex][0] || (a[j][0] == a[minIndex][0] && a[j][1] < a[minIndex][1])) {
                    minIndex = j;
                }
            }
            int temp[] = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.deepToString(a));
        scan.close();
    }
}
