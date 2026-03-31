import java.util.*;
// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.
// Examples
// Examples 1:
// Input: N = 145
// Output: Yes
// Explanation: 1! + 4! + 5! = 145. Hence 145 is a strong number. 

// Example 2:
// Input:  26
// Output: No
// Explanation: 2! + 6! = 722. Hence 26 is not a strong number.
public class _21_strongNumber {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int n1) {
        int n = n1;
        int sum = 0, rem;
        while (n > 0) {
            rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }
        if (sum == n)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (isStrong(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scan.close();
    }
}
