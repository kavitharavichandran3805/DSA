// Problem Statement: Check if the number is a Harshad(or Niven) number or not.

// Examples:

// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

import java.util.*;

public class _25_harshadNumber {
    public static boolean isHarshad(int num) {
        int n = num, sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem;
            n /= 10;
        }
        if (num % sum == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isHarshad(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
