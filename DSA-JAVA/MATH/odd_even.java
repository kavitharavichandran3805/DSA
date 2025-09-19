import java.util.*;

public class odd_even {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        n = scan.nextInt();
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        if ((n | 1) != n) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        scan.close();

    }
}