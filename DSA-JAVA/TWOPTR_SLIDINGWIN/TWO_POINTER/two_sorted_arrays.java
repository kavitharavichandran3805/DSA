import java.util.*;

public class two_sorted_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        System.err.println("Enter the size of arr1 and arr2");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of arr1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        System.out.println("Enter the elements of arr2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }
        int[] result = new int[n1 + n2];
        int f, s, k = 0;
        f = s = 0;
        while (true) {
            if (arr1[f] > arr2[s]) {
                result[k] = arr2[s];
                ++s;
            } else {
                result[k] = arr1[f];
                ++f;
            }
            if (f == arr1.length && s != arr2.length) {
                while (s < arr2.length) {
                    result[k] = arr2[s];
                    ++s;
                    ++k;
                }
                break;
            } else if (f != arr1.length && s == arr2.length) {
                while (f < arr1.length) {
                    result[k] = arr1[f];
                    ++f;
                    ++k;
                }
                break;
            }
            ++k;
        }

        System.out.println(Arrays.toString(result));
        scan.close();
    }
}
