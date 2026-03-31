import java.util.*;

// public class _15_nthFibonacci {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int n = scan.nextInt();
//         int a = 0, b = 1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a + " ");
//             int next = a + b;
//             a = b;
//             b = next;
//         }
//         scan.close();
//     }
// }

public class _15_nthFibonacci {
    public static int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
        scan.close();
    }
}
