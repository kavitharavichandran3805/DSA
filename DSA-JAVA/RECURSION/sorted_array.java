import java.util.Scanner;

public class sorted_array {
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
        System.out.println("Array is sorted: " + check_sorted(a, n, 0));
        scan.close();

    }

    public static boolean check_sorted(int[] a, int n, int index) {
        if (index == n - 1) {
            return true;
        }
        if (a[index] < a[index + 1]) {
            return check_sorted(a, n, index + 1);// return a[index]><a[index+1] && check_sorted(a,n,index+1)
        }
        return false;

    }
}
