import java.util.Scanner;

public class rotated_bn_srch {
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
        System.out.println(binary_search(a, target, 0, a.length - 1));

        scan.close();
    }

    public static int binary_search(int[] a, int target, int s, int e) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (a[mid] == target) {
            return mid;
        }
        if (a[s] <= a[mid]) {
            if (target >= a[s] && target <= a[mid]) {
                return binary_search(a, target, s, mid - 1);
            } else {
                return binary_search(a, target, mid + 1, e);
            }
        }
        if (target >= a[mid] && target <= a[e]) {
            return binary_search(a, target, mid + 1, e);
        }
        return binary_search(a, target, s, mid - 1);
    }
}
