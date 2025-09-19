//package SORTING;

import java.util.Scanner;

public class order_agnostic_bs {
    public static void binary_search(int[] a, int n, int s, int asc_or_dec) {
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            if (asc_or_dec == 1) {
                int mid = start + (end - start) / 2;
                if (a[mid] == s) {
                    int pos = mid + 1;
                    System.out.println("The element is present in position " + pos);
                    break;
                } else if (a[mid] < s) {
                    start = mid + 1;
                } else if (a[mid] > s) {
                    end = mid - 1;
                } else {
                    System.out.println("Element not found");
                    break;
                }

            } else {
                int mid = start + (end - start) / 2;
                if (s == a[mid]) {
                    int pos = mid + 1;
                    System.out.println("The element is present in position " + pos);
                    break;
                } else if (a[mid] < s) {
                    end = mid - 1;
                } else if (a[mid] > s) {
                    start = mid + 1;
                } else {
                    System.out.println("Element not found");
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = scan.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int s;
        System.out.println("Enter the element to be searched:");
        s = scan.nextInt();
        int asc_or_dec = (a[0] < a[n - 1]) ? 1 : -1;
        binary_search(a, n, s, asc_or_dec);
        scan.close();
    }
}
