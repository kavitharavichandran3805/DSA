import java.util.Scanner;

public class ceiling_of_a_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int val;
        System.out.println("Enter the element to find its floor value");
        val = scan.nextInt();
        int s = 0, e = a.length - 1;
        int ceil;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (a[mid] == val) {
                ceil = mid;
                break;
            } else if (a[mid] > val) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        ceil = s;
        System.out.println("The floor value of the number is " + a[ceil]);
        scan.close();

    }
}
