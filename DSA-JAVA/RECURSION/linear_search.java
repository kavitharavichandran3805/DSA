import java.util.Scanner;

public class linear_search {
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
        System.out.println("Element found: " + linear_search_method(a, target, 0));
        scan.close();
    }

    public static boolean linear_search_method(int[] a, int s, int index) {
        if (index == a.length) {
            return false;
        }
        return s == a[index] || linear_search_method(a, s, index + 1);
    }
}
