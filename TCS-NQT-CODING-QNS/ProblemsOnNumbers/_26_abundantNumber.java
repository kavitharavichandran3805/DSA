import java.util.*;
// Problem Statement: Check if the number is an abundant number or not.

// Examples
// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

// Example 2:
// Input: 21
// Output: Not Abundant Number
// Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number.

public class _26_abundantNumber {
    public static boolean isAbundant(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    sum += i;
                } else {
                    sum += i;
                    sum += (n / i);
                }
            }
        }
        sum -= n;
        return (sum > n);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isAbundant(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
