
//average of all odd numbers

import java.util.Scanner;

public class avgOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        scan.close();
        int oddSum = 0, oddct = 0;
        for (int num : a) {
            if (num % 2 != 0) {
                oddSum += num;
                oddct += 1;
            }
        }
        System.out.println(oddSum / oddct);
    }
}
