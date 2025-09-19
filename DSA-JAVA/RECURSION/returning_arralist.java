import java.util.ArrayList;
import java.util.Scanner;

public class returning_arralist {
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

        System.out.println(ln_src(a, target, 0));
        scan.close();
    }

    public static ArrayList<Integer> ln_src(int[] a, int s, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == a.length) {
            return list;
        }
        if (a[index] == s) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelow = ln_src(a, s, index + 1);
        list.addAll(ansFromBelow);
        return list;
    }
}
