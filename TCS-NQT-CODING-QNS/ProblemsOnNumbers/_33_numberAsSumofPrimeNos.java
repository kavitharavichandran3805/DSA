// Problem Statement: Given a number n, express the number as a sum of 2 prime numbers.

// Examples
// Example 1:
// Input : N = 74
// Output : True . 
// Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

// Example 2:
// Input : N = 11
// Output : False. 
// Explanation: 11 cannot be expressed as sum of two prime numbers.

import java.util.*;

public class _33_numberAsSumofPrimeNos {

    public static boolean isPrime(int n) {
        if (n == 2)
            return true;
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("False");
            System.exit(0);
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime(i)) {
                if (isPrime(n - i)) {
                    System.out.println("True");
                    System.exit(0);
                }
            }
        }
        System.out.println("False");

        scan.close();

    }
}

// public class NumberAsSumOfPrimes {

// // Generate a boolean array for primes using Sieve of Eratosthenes
// public static boolean[] sieve(int n) {
// boolean[] isPrime = new boolean[n + 1];
// Arrays.fill(isPrime, true);
// isPrime[0] = isPrime[1] = false;

// for (int i = 2; i * i <= n; i++) {
// if (isPrime[i]) {
// for (int j = i * i; j <= n; j += i) {
// isPrime[j] = false;
// }
// }
// }
// return isPrime;
// }

// public static boolean canBeSumOfTwoPrimes(int n) {
// if (n < 4) return false; // smallest even sum of two primes is 4 (2 + 2)

// boolean[] prime = sieve(n);

// for (int i = 2; i <= n / 2; i++) {
// if (prime[i] && prime[n - i]) {
// return true;
// }
// }
// return false;
// }

// public static void main(String[] args) {
// Scanner scan = new Scanner(System.in);
// int n = scan.nextInt();

// if (canBeSumOfTwoPrimes(n))
// System.out.println("True");
// else
// System.out.println("False");
// }
// }