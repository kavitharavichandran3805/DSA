// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples
// Input: N = 5, r = 3
// Output: 60
// Explanation: To find permutations of n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! is 60.

// Input: N=6, r = 4.
// Output: 360 
// Explanation: The value of 6!/(6-4)! is 360.

import java.util.*;

public class _29_permutationNR {

    public static int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(fact(n) / fact(n - r));
        scan.close();
    }
}
