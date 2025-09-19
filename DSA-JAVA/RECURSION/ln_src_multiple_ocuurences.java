import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ln_src_multiple_ocuurences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int target;
        System.out.println("Enter the element to be searched");
        target = scan.nextInt();
        ln_src(a, target, 0);
        System.out.println(Arrays.asList(arr));
        scan.close();
    }

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void ln_src(int[] a, int s, int index) {
        if (index == a.length) {
            return;
        }
        if (a[index] == s) {
            arr.add(index);
        }
        ln_src(a, s, index + 1);
    }
}
