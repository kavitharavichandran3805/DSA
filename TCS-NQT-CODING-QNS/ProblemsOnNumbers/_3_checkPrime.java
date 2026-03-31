// Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1 and itself and the total number of divisors is 2.

// Examples
//                 Example 1:
//                 Input:N = 2

//                 Output:True

//                 Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).

//                 Example 2:
//                 Input:N =10                

//                 Output: False

//                 Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10. 
import java.util.*;

public class _3_checkPrime {
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (isPrime(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime");
        }
        scan.close();
    }
}
