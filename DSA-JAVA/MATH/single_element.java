import java.util.*;

public class single_element {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("enter the size");
        n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int result = 0;
        for (int ele : a) {
            result = result ^ ele;
        }
        System.out.println(result);
        scan.close();
        int num = 5;
        int i = 1;
        System.out.println(num & (1 << (i - 1))); // to find the ith bit

        // reset the ith bit

        i = 1;
        System.out.println(num & (~(1 << (i - 1))));

    }
}
